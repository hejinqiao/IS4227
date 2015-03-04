/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.ContentMgtAdmin;

import Entity.ProductMgt.WineryEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ser3na
 */
@Stateless
public class AdminContentMgtBean implements AdminContentMgtBeanLocal {
    @PersistenceContext
    private EntityManager em;
    
    public void addWinery (String wineryName, String wineryAddress, String wineryContact){
        WineryEntity we = new WineryEntity();
        we.setWineryName(wineryName);
        we.setWineryAddress(wineryAddress);
        we.setWineryContact(wineryContact);
        
    }
    
}
