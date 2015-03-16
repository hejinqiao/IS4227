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
        System.out.println("adding ");
        
        Query wineryQ = em.createQuery("SELECT w FROM WineryEntity w WHERE w.wineryName=?1");
        wineryQ.setParameter(1, wineryName);
        WineryEntity w = (WineryEntity) wineryQ.getResultList().get(0);
        System.out.println("winery: " + w.getWineryName());
        
        Query regionQ = em.createQuery("SELECT w FROM RegionEntity w WHERE w.regionName=?1");
        regionQ.setParameter(1, regionName);
        RegionEntity r = (RegionEntity) regionQ.getResultList().get(0);
        System.out.println("region: " + r.getRegionName());
        
        Query cateQ = em.createQuery("SELECT w FROM CategoryEntity w WHERE w.categoryName=?1");
        cateQ.setParameter(1, cateName);
        CategoryEntity c = (CategoryEntity) cateQ.getResultList().get(0);
        System.out.println("winery: " + c.getCategoryName());
        
        ItemEntity i = new ItemEntity(itemName, vitage, expiringDate, tastingNote, c, r, w);
        em.persist(i);
        return i;
    }

    @Override
    public List<WineryEntity> getAllWinery() throws ExistException {
        Query q = em.createQuery("SELECT m FROM WineryEntity m");
        if (q.getResultList().isEmpty()) {
            throw new ExistException("No winery result available!");
        }
//        for(Object o: (List<WineryEntity>) q.getResultList()){
//            ((WineryEntity) o).getItemList().size();
//        }
        return q.getResultList();
    }

    @Override
    public List<RegionEntity> getAllRegion() throws ExistException {
        Query q = em.createQuery("SELECT m FROM RegionEntity m");
        if (q.getResultList().isEmpty()) {
            throw new ExistException("No region result available!");
        }
//        for(Object o: (List<RegionEntity>) q.getResultList()){
//            ((RegionEntity) o).getItemList().size();
//        }
        return q.getResultList();
    }

    @Override
    public List<CategoryEntity> getAllCategory() throws ExistException {
        Query q = em.createQuery("SELECT m FROM CategoryEntity m");
        if (q.getResultList().isEmpty()) {
            throw new ExistException("No category result available!");
        }
        
//        for(Object o: (List<CategoryEntity>) q.getResultList()){
//            ((CategoryEntity) o).getItemList().size();
//        }
        return q.getResultList();
    }

    @Override
    public List<ItemEntity> getAllItem() throws ExistException {
        Query q = em.createQuery("SELECT m FROM ItemEntity m");
        if (q.getResultList().isEmpty()) {
            throw new ExistException("No item result available!");
        }
        return q.getResultList();       
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
        Long id = Long.parseLong(wineryID);
        winery = em.find(WineryEntity.class, id);
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
    
    @Override
    public RegionEntity getRegionById(String regionId) throws ExistException {
        region = em.find(RegionEntity.class, regionId);
        return region;
    }
 
    @Override
    public RegionEntity getRegionByName(String regionName){
        Query q = em.createQuery("SELECT m FROM RegionEntity m WHERE m.regionName=?1");
        q.setParameter(1, regionName);
        return (RegionEntity) q.getResultList().get(0);
    }

    @Override
    public boolean removeRegion(String regionID) throws ExistException {
        Long id = Long.parseLong(regionID);
        region = em.find(RegionEntity.class, id);
        System.err.println("remove region: " + region.getId());
        if (region == null) {
            throw new ExistException("Region does not exist!");
        }
        List itemList = getAllItem();
        Iterator<ItemEntity> itemIterator = itemList.iterator();
        while (itemIterator.hasNext()) {
            if (itemIterator.next().getRegion().equals(region)) {
                throw new ExistException("Region is currently in use, you cannot delete it!");
            }
        }
        em.remove(region);
        return true;
    }
    
        @Override
    public CategoryEntity getCategoryById(String categoryId) throws ExistException {
        category = em.find(CategoryEntity.class, categoryId);
        return category;
    }
 
    @Override
    public CategoryEntity getCategoryByName(String categoryName){
        Query q = em.createQuery("SELECT m FROM CategoryEntity m WHERE m.categoryName=?1");
        q.setParameter(1, categoryName);
        return (CategoryEntity) q.getResultList().get(0);
    }

    @Override
    public boolean removeCategory(String categoryID) throws ExistException {
        Long id = Long.parseLong(categoryID);
        category = em.find(CategoryEntity.class, id);
        System.err.println("remove category: " + category.getId());
        if (category == null) {
            throw new ExistException("Category does not exist!");
        }
        List itemList = getAllItem();
        Iterator<ItemEntity> itemIterator = itemList.iterator();
        while (itemIterator.hasNext()) {
            if (itemIterator.next().getCategory().equals(category)) {
                throw new ExistException("Category is currently in use, you cannot delete it!");
            }
        }
        em.remove(category);
        return true;
    }
    
    @Override
    public boolean updateItem(Long id, String cateName, String regionName, String wineryName, String itemName, String vitage, Calendar expiringDate, String tastingNote) throws ExistException {
        item = em.find(ItemEntity.class, id);
        if (item == null){
            throw new ExistException("Item does not exist!");
        } else {
            item.setItemName(itemName);
            item.setVitage(vitage);
            item.setTastingNote(tastingNote);
            item.setExpiringDate(expiringDate);
            
            Query wineryQ = em.createQuery("SELECT w FROM WineryEntity w WHERE w.wineryName=?1");
            wineryQ.setParameter(1, wineryName);
            WineryEntity w = (WineryEntity) wineryQ.getResultList().get(0);
            item.setWinery(w);
        
            Query regionQ = em.createQuery("SELECT w FROM RegionEntity w WHERE w.regionName=?1");
            regionQ.setParameter(1, regionName);
            RegionEntity r = (RegionEntity) regionQ.getResultList().get(0);
            item.setRegion(r);
        
            Query cateQ = em.createQuery("SELECT w FROM CategoryEntity w WHERE w.categoryName=?1");
            cateQ.setParameter(1, cateName);
            CategoryEntity c = (CategoryEntity) cateQ.getResultList().get(0);
            item.setCategory(c);
        
            em.persist(item);
            
            return true;
        }
    }    

    @Override
    public boolean updateWinery(Long id, String name, String address, String contact) throws ExistException {
        winery = em.find(WineryEntity.class, id);
        if (winery == null){
            throw new ExistException("Winery does not exist!");
        } else {
            winery.setWineryAddress(address);
            winery.setWineryContact(contact);
            winery.setWineryName(name);
            em.persist(winery);
            return true;
        }
    }

    @Override
    public boolean updateRegion(Long id, String name, String country, String spec) throws ExistException {
        region = em.find(RegionEntity.class, id);
        if (region == null){
            throw new ExistException("Region does not exist!");
        } else {
            region.setCountry(country);
            region.setRegionName(name);
            region.setRegionSpec(spec);
            em.persist(region);
            return true;
        }
    }

    @Override
    public boolean updateCategory(Long id, String name, String spec) throws ExistException {
      category = em.find(CategoryEntity.class, id);
        if (category == null){
            throw new ExistException("Category does not exist!");
        } else {
            category.setCategoryName(name);
            category.setCategorySpec(spec);
            em.persist(category);
            return true;
        }
    }

}
