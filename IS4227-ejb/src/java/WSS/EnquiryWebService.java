/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Entity.AccountMgt.AccountEntity;
import Entity.AccountMgt.EnquiryEntity;
import SessionBean.AccountMgtBean;
import SessionBean.EnquiryMgt.EnquiryMgtBean;
import SessionBean.EnquiryMgt.EnquiryMgtBeanLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.JSONArray;
import org.json.JSONObject;
import util.exception.AccountNotFoundException;
import util.exception.AdminNotFoundException;
import util.exception.EnquiryNotFoundException;

/**
 *
 * @author chenliyuquan
 */
@WebService(serviceName = "EnquiryWebService")
@Stateless()
public class EnquiryWebService {
    @EJB
    private EnquiryMgtBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")
    @EJB AccountMgtBean accRef;
    
    @WebMethod(operationName = "submitEnquery")
    public void submitEnquery(@WebParam(name = "accountId") Long accountId, @WebParam(name = "content") String content) throws AccountNotFoundException {
        ejbRef.submitEnquery(accountId, content);
    }

    @WebMethod(operationName = "viewAllEnquiry")
    public String viewAllEnquiry(@WebParam(name = "adminId") Long adminId) throws AdminNotFoundException {
        List<EnquiryEntity> result = ejbRef.viewAllEnquiry(adminId);
        JSONArray array = new JSONArray();
        
        for (EnquiryEntity result1 : result) {
            JSONObject obj = new JSONObject();
            boolean replied = result1.getReplied();
            AccountEntity acc = accRef.getAccountEntityById(result1.getAccountId());
            String email = acc.getEmail();
            String content = result1.getContent();
            Long enquiryId = result1.getId();
            
            obj.put("repied", replied);
            obj.put("email", email);
            obj.put("content", content);
            obj.put("enquiryId", enquiryId);
            
            array.put(obj);
        }
        
        return array.toString();
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
