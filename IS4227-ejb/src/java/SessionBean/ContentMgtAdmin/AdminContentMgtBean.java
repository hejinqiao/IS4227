/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.ContentMgtAdmin;

import Entity.ProductMgt.CategoryEntity;
import Entity.ProductMgt.ItemEntity;
import Entity.ProductMgt.RegionEntity;
import Entity.ProductMgt.WineryEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import util.exception.ExistException;

/**
 *
 * @author Ser3na
 */
@Stateless
@LocalBean
public class AdminContentMgtBean implements AdminContentMgtBeanRemote {

    @PersistenceContext
    private EntityManager em;
    WineryEntity winery;
    RegionEntity region;
    CategoryEntity category;
    ItemEntity item;

    public AdminContentMgtBean() {
        //insert test case if neede
    }

    @Override
    public WineryEntity addWinery(WineryEntity winery) {
        em.persist(winery);
        return winery;
    }

    @Override
    public RegionEntity addRegion(RegionEntity region) {
        em.persist(region);
        return region;
    }

    @Override
    public CategoryEntity addCategory(CategoryEntity category) {
        em.persist(category);
        return category;
    }

    @Override
    public ItemEntity addItem(ItemEntity item) {
        em.persist(item);
        return item;
    }

    @Override
    public List<WineryEntity> getAllWinery() throws ExistException {
        Query q = em.createQuery("SELECT m FROM WineryEntity m");
        List wineryList = new ArrayList<WineryEntity>();
        for (Object o : q.getResultList()) {
            WineryEntity m = (WineryEntity) o;
            wineryList.add(m);
        }
        if (wineryList.isEmpty()) {
            throw new ExistException("No winery result available!");
        }
        return wineryList;
    }

    @Override
    public List<RegionEntity> getAllRegion() throws ExistException {
        Query q = em.createQuery("SELECT m FROM RegionEntity m");
        List regionList = new ArrayList<RegionEntity>();
        for (Object o : q.getResultList()) {
            RegionEntity m = (RegionEntity) o;
            regionList.add(m);
        }
        if (regionList.isEmpty()) {
            throw new ExistException("No region result available!");
        }
        return regionList;
    }

    @Override
    public List<CategoryEntity> getAllCategory() throws ExistException {
        Query q = em.createQuery("SELECT m FROM CategoryEntity m");
        List categoryList = new ArrayList<CategoryEntity>();
        for (Object o : q.getResultList()) {
            CategoryEntity m = (CategoryEntity) o;
            categoryList.add(m);
        }
        if (categoryList.isEmpty()) {
            throw new ExistException("No category result available!");
        }
        return categoryList;
    }

    @Override
    public List<ItemEntity> getAllItem() throws ExistException {
        Query q = em.createQuery("SELECT m FROM ItemEntity m");
        List itemList = new ArrayList<ItemEntity>();
        for (Object o : q.getResultList()) {
            ItemEntity m = (ItemEntity) o;
            itemList.add(m);
        }
        if (itemList.isEmpty()) {
            throw new ExistException("No item result available!");
        }
        return itemList;
    }

    @Override
    public ItemEntity getItemById(String itemId) throws ExistException {
        item = em.find(ItemEntity.class, itemId);
        return item;
    }

    @Override
    public boolean removeItem(String itemID) throws ExistException {
        item = em.find(ItemEntity.class, itemID);
        System.err.println("remove item: " + item.getId());
        if (item == null) {
            throw new ExistException("Item does not exist!");
        }
        em.remove(item);
        return true;
    }

    @Override
    public WineryEntity getWineryById(String wineryId) throws ExistException {
        winery = em.find(WineryEntity.class, wineryId);
        return winery;
    }

    @Override
    public boolean removeWinery(String wineryID) throws ExistException {
        winery = em.find(WineryEntity.class, wineryID);
        System.err.println("remove winery: " + winery.getId());
        if (winery == null) {
            throw new ExistException("Winery does not exist!");
        }
        List itemList = getAllItem();
        Iterator<ItemEntity> itemIterator = itemList.iterator();
        while (itemIterator.hasNext()) {
            if (itemIterator.next().getWinery().equals(winery)) {
                throw new ExistException("Winery is currently in use, you cannot delete it!");
            }
        }
        em.remove(winery);
        return true;
    }
}
