/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.ContentMgtAdmin;

import Entity.ProductMgt.CategoryEntity;
import Entity.ProductMgt.RegionEntity;
import Entity.ProductMgt.WineryEntity;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
    public AdminContentMgtBean(){
        //insert test case if neede
    } 
    
    @Override
    public WineryEntity addWinery (WineryEntity winery){
        em.persist(winery);
        return winery;
    }
    
    @Override
    public RegionEntity addRegion (RegionEntity region){
        em.persist(region);
        return region;
    }
    
    @Override
    public CategoryEntity addCategory (CategoryEntity category){
        em.persist(category);
        return category;
    }
    
    
}
