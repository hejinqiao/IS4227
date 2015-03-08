/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.EnquiryMgt;

import Entity.AccountMgt.AccountEntity;
import Entity.AccountMgt.AdminAccountEntity;
import Entity.AccountMgt.EnquiryEntity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import util.exception.AccountNotFoundException;
import util.exception.AdminNotFoundException;
import util.exception.EnquiryNotFoundException;

/**
 *
 * @author HanXiangyu
 */
@Stateless
public class EnquiryMgtBean implements EnquiryMgtBeanLocal {
    @PersistenceContext
    private EntityManager em;
    
    public void submitEnquery(Long accountId, String content) throws AccountNotFoundException{
        AccountEntity acc = em.find(AccountEntity.class, accountId);
        if (acc == null) {
            throw new AccountNotFoundException("Account cannot found!");
        }else{
            EnquiryEntity enquiry = new EnquiryEntity(acc, content, Calendar.getInstance(), false);
            
            if (acc.getEnquiryList().isEmpty()){
            ArrayList<EnquiryEntity> enquiryList = new ArrayList<> ();
            enquiryList.add(enquiry);
            acc.setEnquiryList(enquiryList);
            }else {
                acc.getEnquiryList().add(enquiry);
            }
            
            em.persist(enquiry);
            em.persist(acc);
            
            //insert email function, send to admin
            
            
            //insert email function, send to user
            String emailAddress = acc.getEmail();
        }
    }
    
    public List<EnquiryEntity> viewAllEnquiry(Long adminId)throws AdminNotFoundException{
        AdminAccountEntity admin = em.find(AdminAccountEntity.class, adminId);
        if(admin == null){
            throw new AdminNotFoundException();
        }else{
            Query q;
            q = em.createQuery("select i from EnquiryEntity i");
            return q.getResultList();
        }
    }
    
    public EnquiryEntity viewOneEnquiry(Long adminId, Long enquiryId) throws AdminNotFoundException, EnquiryNotFoundException{
        AdminAccountEntity admin = em.find(AdminAccountEntity.class, adminId);
        if(admin == null){
            throw new AdminNotFoundException();
        }else{
            Query q;
            q = em.createQuery("select i from EnquiryEntity i where i.id=?1");
            q.setParameter(1, enquiryId);
            if(q.getResultList().isEmpty()){
                throw new EnquiryNotFoundException();
            }
            return (EnquiryEntity)q.getResultList().get(0);
        }
    }
    
    public void processEnquiry(Long adminId, Long enquiryId, String replyContent) throws AdminNotFoundException, EnquiryNotFoundException{
        AdminAccountEntity admin = em.find(AdminAccountEntity.class, adminId);
        if(admin == null){
            throw new AdminNotFoundException();
        }else{
            Query q;
            q = em.createQuery("select i from EnquiryEntity i where i.id=?1");
            q.setParameter(1, enquiryId);
            if(q.getResultList().isEmpty()){
                throw new EnquiryNotFoundException();
            }
            EnquiryEntity enquiry = (EnquiryEntity) q.getResultList().get(0);
            
            //send email to user
            String userEmailAddress = enquiry.getAuthor().getEmail();
            //replyContent is passed as parameter
                       
            enquiry.setReplied(Boolean.TRUE);
            em.persist(enquiry);
        }
    }
       
}
