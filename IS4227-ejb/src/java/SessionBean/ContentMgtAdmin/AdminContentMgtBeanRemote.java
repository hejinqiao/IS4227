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
import java.util.List;
import javax.ejb.Remote;
import util.exception.ExistException;

/**
 *
 * @author Ser3na
 */
@Remote
public interface AdminContentMgtBeanRemote {
    
    WineryEntity addWinery (WineryEntity winery);
    
    RegionEntity addRegion (RegionEntity region);
    
    CategoryEntity addCategory (CategoryEntity category);
    
    ItemEntity addItem (ItemEntity item);
    
    List<WineryEntity> getAllWinery() throws ExistException;
    
    List<RegionEntity> getAllRegion() throws ExistException;
    
    List<CategoryEntity> getAllCategory() throws ExistException;
    
    List<ItemEntity> getAllItem() throws ExistException;
    
    ItemEntity getItemById(String itemId) throws ExistException;
    
    boolean removeItem (String itemID) throws ExistException;
    
    WineryEntity getWineryById (String wineryId) throws ExistException;
    
    boolean removeWinery (String wineryId) throws ExistException;
}
