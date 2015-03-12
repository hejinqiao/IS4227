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
import java.util.List;
import javax.ejb.Remote;
import util.exception.ExistException;

/**
 *
 * @author Ser3na
 */
@Remote
public interface AdminContentMgtBeanRemote {
    
    public WineryEntity addWinery(String name, String address, String contact);
    
    public RegionEntity addRegion(String name, String country, String spec);
    
    public CategoryEntity addCategory(String name, String spec);
    
    public ItemEntity addItem(String cateName, String regionName, String wineryName, String itemName, String vitage, Calendar expiringDate, String tastingNote);
    
    List<WineryEntity> getAllWinery() throws ExistException;
    
    List<RegionEntity> getAllRegion() throws ExistException;
    
    List<CategoryEntity> getAllCategory() throws ExistException;
    
    List<ItemEntity> getAllItem() throws ExistException;
    
    ItemEntity getItemById(String itemId) throws ExistException;
    
    public ItemEntity getItemByName(String itemName);
    
    boolean removeItem (String itemID) throws ExistException;
    
    WineryEntity getWineryById (String wineryId) throws ExistException;
    
    public WineryEntity getWineryByName(String wineryName);
    
    boolean removeWinery (String wineryId) throws ExistException;
    
    RegionEntity getRegionById (String regionId) throws ExistException;
    
    public RegionEntity getRegionByName(String regionName);
    
    boolean removeRegion (String regionId) throws ExistException;
    
    CategoryEntity getCategoryById (String categoryId) throws ExistException;
    
    public CategoryEntity getCategoryByName(String categoryName);
    
    boolean removeCategory (String categoryId) throws ExistException;
    
    public boolean updateItem(Long id, String cateName, String regionName, String wineryName, String itemName, String vitage, Calendar expiringDate, String tastingNote) throws ExistException;
    
    public boolean updateWinery(Long id, String name, String address, String contact) throws ExistException;
    
    public boolean updateRegion(Long id, String name, String country, String spec) throws ExistException;
    
    public boolean updateCategory(Long id, String name, String spec) throws ExistException;
}
