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
import java.util.Calendar;
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
    public WineryEntity addWinery(String name, String address, String contact) {
        WineryEntity w = new WineryEntity(name, address, contact);       
        em.persist(w);
        return w;
    }

    @Override
    public RegionEntity addRegion(String name, String country, String spec) {
        RegionEntity r = new RegionEntity(name, country, spec);
        em.persist(r);
        return r;
    }

    @Override
    public CategoryEntity addCategory(String name, String spec) {
        CategoryEntity c = new CategoryEntity(name, spec);
        em.persist(c);
        return c;
    }

    @Override
    public ItemEntity addItem(String cateName, String regionName, String wineryName, String itemName, String vitage, Calendar expiringDate, String tastingNote) {
        Query wineryQ = em.createQuery("SELECT w FROM WineryEntity w WHERE w.wineryName=?1");
        wineryQ.setParameter(1, wineryName);
        WineryEntity w = (WineryEntity) wineryQ.getResultList().get(0);
        
        Query regionQ = em.createQuery("SELECT w FROM RegionEntity w WHERE w.regionName=?1");
        regionQ.setParameter(1, regionName);
        RegionEntity r = (RegionEntity) regionQ.getResultList().get(0);
        
        Query cateQ = em.createQuery("SELECT w FROM CategoryEntity w WHERE w.categoryName=?1");
        cateQ.setParameter(1, cateName);
        CategoryEntity c = (CategoryEntity) cateQ.getResultList().get(0);
        
        ItemEntity i = new ItemEntity(itemName, vitage, expiringDate, tastingNote, c, r, w);
        em.persist(i);
        return item;
    }

    @Override
    public List<WineryEntity> getAllWinery() throws ExistException {
        Query q = em.createQuery("SELECT m FROM WineryEntity m");
        List<WineryEntity> wineryList = new ArrayList<>();
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
        List<RegionEntity> regionList = new ArrayList<>();
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
        List<CategoryEntity> categoryList = new ArrayList<>();
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
        List<ItemEntity> itemList = new ArrayList<>();
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
    public ItemEntity getItemByName(String itemName){
        Query q = em.createQuery("SELECT m FROM ItemEntity m WHERE m.itemName=?1");
        q.setParameter(1, itemName);
        ItemEntity i = (ItemEntity) q.getResultList().get(0);
        return i;
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
    public WineryEntity getWineryByName(String wineryName){
        Query q = em.createQuery("SELECT m FROM WineryEntity m WHERE m.wineryName=?1");
        q.setParameter(1, wineryName);
        return (WineryEntity) q.getResultList().get(0);
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
    
    //public CategoryEntity 
}
