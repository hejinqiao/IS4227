/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.ContentMgtMember;

import Entity.AccountMgt.AccountEntity;
import Entity.ProductMgt.CommentEntity;
import Entity.ProductMgt.ItemEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import util.exception.AccountNotFoundException;
import util.exception.CommentNotFoundException;
import util.exception.ProductNotFoundException;

/**
 *
 * @author HanXiangyu
 */
@Stateless
public class MemberContentMgtBean implements MemberContentMgtBeanLocal {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public ItemEntity searchProduct(String itemName) throws ProductNotFoundException{
        Query q = em.createQuery("select i from ItemEntity i where i.itemName=?1");
        q.setParameter(1, itemName);
        if(q.getResultList().isEmpty()){
            throw new ProductNotFoundException("no such product name!");
        }
        return (ItemEntity)q.getResultList().get(0);
    }
    
    @Override
    public ArrayList<ItemEntity> searchProduct(String wineryName, String regionName, String cateName) throws ProductNotFoundException{
        Boolean w = wineryName.toLowerCase().equals("all");
        Boolean r = regionName.toLowerCase().equals("all");
        Boolean c = cateName.toLowerCase().equals("all");
        Query q;
        if(w && r && c){
            q = em.createQuery("select i from ItemEntity i");
        }else if((!w) && r && c){
            q = em.createQuery("select i from ItemEntity i where i.winery.wineryName = ?1");
            q.setParameter(1, wineryName);
        }else if(w && (!r) && c){
            q = em.createQuery("select i from ItemEntity i where i.region.regionName = ?1");
            q.setParameter(1, regionName);
        }else if(w && r && !c){
            q = em.createQuery("select i from ItemEntity i where i.category.categoryName = ?1");
            q.setParameter(1, cateName);
        }else if(!w && !r && c){
            q = em.createQuery("select i from ItemEntity i where i.winery.wineryName = ?1 and i.region.regionName=?2");
            q.setParameter(1, wineryName);
            q.setParameter(2, regionName);
        }else if(!w && r && !c){
            q = em.createQuery("select i from ItemEntity i where i.winery.wineryName = ?1 and i.category.categoryName=?2");
            q.setParameter(1, wineryName);
            q.setParameter(2, cateName);
        }else if(w && !r && !c){
            q = em.createQuery("select i from ItemEntity i where i.category.categoryName = ?1 and i.region.regionName=?2");
            q.setParameter(1, cateName);
            q.setParameter(2, regionName);
        }else {
            q = em.createQuery("select i from ItemEntity i where i.winery.wineryName = ?1 and i.region.regionName=?2 and i.category.categoryName=?3");
            q.setParameter(1, wineryName);
            q.setParameter(2, regionName);
            q.setParameter(3, cateName);
        }
        ArrayList<ItemEntity> productList = new ArrayList(q.getResultList());
        if(productList.isEmpty()){
            throw new ProductNotFoundException("Product cannot be found!");
        }else
        return productList;
    }
    
    @Override
    public void rateProduct(Long accountId, Long itemId, Double rating, String content) throws AccountNotFoundException, ProductNotFoundException{
        AccountEntity acc = em.find(AccountEntity.class, accountId);
        if (acc == null) {
            throw new AccountNotFoundException("Account cannot found!");
        }
        ItemEntity item = em.find(ItemEntity.class, itemId);
        if (item == null) {
            throw new ProductNotFoundException("Product cannot be found!");
        }
        
        CommentEntity comment = new CommentEntity(rating, content);
        comment.setAccount(acc);
        comment.setItem(item);
        
        if (acc.getCommentList().isEmpty()){
            ArrayList<CommentEntity> commentList = new ArrayList<> ();
            commentList.add(comment);
            acc.setCommentList(commentList);
        }else {
            acc.getCommentList().add(comment);
        }
        
        if (item.getCommentList().isEmpty()){
            ArrayList<CommentEntity> commentList = new ArrayList<> ();
            commentList.add(comment);
            item.setCommentList(commentList);
        } else {
            item.getCommentList().add(comment);
        }
        
        em.persist(comment);
        em.persist(acc);
        em.persist(item);
    }
    
    @Override
    public ArrayList<CommentEntity> viewAllCommentsFromAccount(Long accountId) throws AccountNotFoundException{
        AccountEntity acc = em.find(AccountEntity.class, accountId);
        if (acc == null) {
            throw new AccountNotFoundException("Account cannot found!");
        }
        return (ArrayList<CommentEntity>) acc.getCommentList();
    }
    
    @Override
    public List<CommentEntity> viewAllCommentsOfProduct(Long itemId) throws ProductNotFoundException, CommentNotFoundException{
        ItemEntity item = em.find(ItemEntity.class, itemId);
        if (item == null) {
            throw new ProductNotFoundException("Product cannot be found!");
        }
        if(item.getCommentList()==null){
            throw new CommentNotFoundException("No comment can be found!");
        }
        Query q;
        q = em.createQuery("select i from CommentEntity i where i.item.id = ?1");
        q.setParameter(1, itemId);
        return q.getResultList();
    }
    
    //public ArrayList<CommentEntity> viewCommentOfProduct
}
