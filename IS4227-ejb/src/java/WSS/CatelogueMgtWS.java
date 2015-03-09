/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Entity.ProductMgt.CategoryEntity;
import Entity.ProductMgt.ItemEntity;
import Entity.ProductMgt.RegionEntity;
import Entity.ProductMgt.WineryEntity;
import SessionBean.ContentMgtAdmin.AdminContentMgtBeanRemote;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import util.exception.ExistException;

/**
 *
 * @author HanXiangyu
 */
@WebService(serviceName = "CatelogueMgtWS")
@Stateless()
public class CatelogueMgtWS {
    @EJB
    private AdminContentMgtBeanRemote ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addWinery")
    public WineryEntity addWinery(@WebParam(name = "name") String name, @WebParam(name = "address") String address, @WebParam(name = "contact") String contact) {
        return ejbRef.addWinery(name, address, contact);
    }

    @WebMethod(operationName = "addRegion")
    public RegionEntity addRegion(@WebParam(name = "name") String name, @WebParam(name = "country") String country, @WebParam(name = "spec") String spec) {
        return ejbRef.addRegion(name, country, spec);
    }

    @WebMethod(operationName = "addCategory")
    public CategoryEntity addCategory(@WebParam(name = "name") String name, @WebParam(name = "spec") String spec) {
        return ejbRef.addCategory(name, spec);
    }

    @WebMethod(operationName = "addItem")
    public ItemEntity addItem(@WebParam(name = "cateName") String cateName, @WebParam(name = "regionName") String regionName, @WebParam(name = "wineryName") String wineryName, @WebParam(name = "itemName") String itemName, @WebParam(name = "vitage") String vitage, @WebParam(name = "expiringDate") Calendar expiringDate, @WebParam(name = "tastingNote") String tastingNote) {
        return ejbRef.addItem(cateName, regionName, wineryName, itemName, vitage, expiringDate, tastingNote);
    }

    @WebMethod(operationName = "getAllWinery")
    public List<WineryEntity> getAllWinery() throws ExistException {
        return ejbRef.getAllWinery();
    }

    @WebMethod(operationName = "getAllRegion")
    public List<RegionEntity> getAllRegion() throws ExistException {
        return ejbRef.getAllRegion();
    }

    @WebMethod(operationName = "getAllCategory")
    public List<CategoryEntity> getAllCategory() throws ExistException {
        return ejbRef.getAllCategory();
    }

    @WebMethod(operationName = "getAllItem")
    public List<ItemEntity> getAllItem() throws ExistException {
        return ejbRef.getAllItem();
    }

    @WebMethod(operationName = "getItemById")
    public ItemEntity getItemById(@WebParam(name = "itemId") String itemId) throws ExistException {
        return ejbRef.getItemById(itemId);
    }

    @WebMethod(operationName = "getItemByName")
    public ItemEntity getItemByName(@WebParam(name = "itemName") String itemName) {
        return ejbRef.getItemByName(itemName);
    }

    @WebMethod(operationName = "removeItem")
    public boolean removeItem(@WebParam(name = "itemID") String itemID) throws ExistException {
        return ejbRef.removeItem(itemID);
    }

    @WebMethod(operationName = "getWineryById")
    public WineryEntity getWineryById(@WebParam(name = "wineryId") String wineryId) throws ExistException {
        return ejbRef.getWineryById(wineryId);
    }

    @WebMethod(operationName = "getWineryByName")
    public WineryEntity getWineryByName(@WebParam(name = "wineryName") String wineryName) {
        return ejbRef.getWineryByName(wineryName);
    }

    @WebMethod(operationName = "removeWinery")
    public boolean removeWinery(@WebParam(name = "wineryId") String wineryId) throws ExistException {
        return ejbRef.removeWinery(wineryId);
    }
    
}
