/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.EnquiryMgt;

import Entity.AccountMgt.EnquiryEntity;
import java.util.List;
import javax.ejb.Local;
import util.exception.AccountNotFoundException;
import util.exception.AdminNotFoundException;
import util.exception.EnquiryNotFoundException;

/**
 *
 * @author HanXiangyu
 */
@Local
public interface EnquiryMgtBeanLocal {

    public void submitEnquery(Long accountId, String content) throws AccountNotFoundException;

    public List<EnquiryEntity> viewAllEnquiry(Long adminId) throws AdminNotFoundException;

    public EnquiryEntity viewOneEnquiry(Long adminId, Long enquiryId) throws AdminNotFoundException, EnquiryNotFoundException;

    public void processEnquiry(Long adminId, Long enquiryId, String replyContent) throws AdminNotFoundException, EnquiryNotFoundException;
    
}
