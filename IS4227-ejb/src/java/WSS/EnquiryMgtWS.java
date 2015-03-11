/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Entity.AccountMgt.EnquiryEntity;
import SessionBean.EnquiryMgt.EnquiryMgtBeanLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import util.exception.AccountNotFoundException;
import util.exception.AdminNotFoundException;
import util.exception.EnquiryNotFoundException;

/**
 *
 * @author HanXiangyu
 */
@WebService(serviceName = "EnquiryMgtWS")
@Stateless()
public class EnquiryMgtWS {
    @EJB
    private EnquiryMgtBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "submitEnquery")
    public void submitEnquery(@WebParam(name = "accountId") Long accountId, @WebParam(name = "content") String content) throws AccountNotFoundException {
        ejbRef.submitEnquery(accountId, content);
    }

    @WebMethod(operationName = "viewAllEnquiry")
    public List<EnquiryEntity> viewAllEnquiry(@WebParam(name = "adminId") Long adminId) throws AdminNotFoundException {
        return ejbRef.viewAllEnquiry(adminId);
    }

    @WebMethod(operationName = "viewOneEnquiry")
    public EnquiryEntity viewOneEnquiry(@WebParam(name = "adminId") Long adminId, @WebParam(name = "enquiryId") Long enquiryId) throws AdminNotFoundException, EnquiryNotFoundException {
        return ejbRef.viewOneEnquiry(adminId, enquiryId);
    }

    @WebMethod(operationName = "processEnquiry")
    public void processEnquiry(@WebParam(name = "adminId") Long adminId, @WebParam(name = "enquiryId") Long enquiryId, @WebParam(name = "replyContent") String replyContent) throws AdminNotFoundException, EnquiryNotFoundException {
        ejbRef.processEnquiry(adminId, enquiryId, replyContent);
    }
    
}
