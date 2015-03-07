/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Entity.ProductMgt.CommentEntity;
import Entity.ProductMgt.ItemEntity;
import SessionBean.ContentMgtMember.MemberContentMgtBeanLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import util.exception.AccountNotFoundException;
import util.exception.CommentNotFoundException;
import util.exception.ProductNotFoundException;

/**
 *
 * @author HanXiangyu
 */
@WebService(serviceName = "ProductMgtWS")
@Stateless()
public class ProductMgtWS {
    @EJB
    private MemberContentMgtBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "searchProduct")
    public ItemEntity searchProduct(@WebParam(name = "itemName") String itemName) {
        try {
            return ejbRef.searchProduct(itemName);
        }catch(ProductNotFoundException exp){
            System.out.println("no item");
        }
        return null;
    }

    @WebMethod(operationName = "searchProduct_1")
    @RequestWrapper(className = "searchProduct_1")
    @ResponseWrapper(className = "searchProduct_1Response")
    public ArrayList<ItemEntity> searchProduct(@WebParam(name = "wineryName") String wineryName, @WebParam(name = "regionName") String regionName, @WebParam(name = "cateName") String cateName) throws ProductNotFoundException {
        return ejbRef.searchProduct(wineryName, regionName, cateName);
    }

    @WebMethod(operationName = "rateProduct")
    public void rateProduct(@WebParam(name = "accountId") Long accountId, @WebParam(name = "itemId") Long itemId, @WebParam(name = "rating") Double rating, @WebParam(name = "content") String content) throws AccountNotFoundException, ProductNotFoundException {
        ejbRef.rateProduct(accountId, itemId, rating, content);
    }

    @WebMethod(operationName = "viewAllCommentsFromAccount")
    public ArrayList<CommentEntity> viewAllCommentsFromAccount(@WebParam(name = "accountId") Long accountId) throws AccountNotFoundException {
        return ejbRef.viewAllCommentsFromAccount(accountId);
    }

    @WebMethod(operationName = "viewAllCommentsOfProduct")
    public List<CommentEntity> viewAllCommentsOfProduct(@WebParam(name = "itemId") Long itemId) {
        try{
                return ejbRef.viewAllCommentsOfProduct(itemId);
            }catch(ProductNotFoundException exp){
                System.out.println("no product found!");
            }catch(CommentNotFoundException exp){
                System.out.println("no comment found!");
            }
        
        return null;
    }
}
    

