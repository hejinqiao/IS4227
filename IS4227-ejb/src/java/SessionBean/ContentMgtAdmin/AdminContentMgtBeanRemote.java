/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.ContentMgtAdmin;

import Entity.ProductMgt.CategoryEntity;
import Entity.ProductMgt.RegionEntity;
import Entity.ProductMgt.WineryEntity;
import javax.ejb.Remote;

/**
 *
 * @author Ser3na
 */
@Remote
public interface AdminContentMgtBeanRemote {
    
    WineryEntity addWinery (WineryEntity winery);
    
    RegionEntity addRegion (RegionEntity region);
    
    CategoryEntity addCategory (CategoryEntity category);
}
