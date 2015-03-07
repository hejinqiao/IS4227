/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.ContentMgtMember;

import Entity.ProductMgt.CommentEntity;
import Entity.ProductMgt.ItemEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import util.exception.AccountNotFoundException;
import util.exception.CommentNotFoundException;
import util.exception.ProductNotFoundException;

/**
 *
 * @author HanXiangyu
 */
@Local
public interface MemberContentMgtBeanLocal {

    public ItemEntity searchProduct(String itemName) throws ProductNotFoundException;

    public ArrayList<ItemEntity> searchProduct(String wineryName, String regionName, String cateName) throws ProductNotFoundException;

    public void rateProduct(Long accountId, Long itemId, Double rating, String content) throws AccountNotFoundException, ProductNotFoundException;

    public ArrayList<CommentEntity> viewAllCommentsFromAccount(Long accountId) throws AccountNotFoundException;

    public List<CommentEntity> viewAllCommentsOfProduct(Long itemId) throws ProductNotFoundException, CommentNotFoundException;
    
}
