/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Entity.AccountMgt.AccountEntity;
import Entity.AccountMgt.PurchaseEntity;
import Entity.AccountMgt.TransactionEntity;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "AccountMgt")
@Stateless()
public class AccountMgt {

    @EJB
    private AccountMgtBean ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "checkAccount")
    public boolean checkAccount(@WebParam(name = "email") String email) {
        return ejbRef.checkAccount(email);
    }

    @WebMethod(operationName = "checkAdminAccount")
    public boolean checkAdminAccount(@WebParam(name = "adminId") String adminId) {
        return ejbRef.checkAdminAccount(adminId);
    }

    @WebMethod(operationName = "registerAccount")
    public boolean registerAccount(@WebParam(name = "email") String email, @WebParam(name = "encryptedPassword") String encryptedPassword, @WebParam(name = "name") String name, @WebParam(name = "gender") String gender) {
        return ejbRef.registerAccount(email, encryptedPassword, name, gender);
    }

    @WebMethod(operationName = "emailActivationCode")
    public JSONObject emailActivationCode(@WebParam(name = "email") String email) {
        ArrayList<String> al = ejbRef.emailActivationCode(email);
        JSONObject jo = new JSONObject();
        jo.put("email", al.get(0));
        jo.put("name", al.get(1));
        jo.put("activeCode", al.get(2));

        //JSONArray ja = new JSONArray();
        //ja.add(jo);
        return jo;

    }

    @WebMethod(operationName = "activateAccount")
    public String activateAccount(@WebParam(name = "email") String email, @WebParam(name = "activationCode") String activationCode) {
        return ejbRef.activateAccount(email, activationCode);
    }

    @WebMethod(operationName = "memberLogin")
    public String memberLogin(@WebParam(name = "email") String email, @WebParam(name = "encryptedPassword") String encryptedPassword) {
        return ejbRef.memberLogin(email, encryptedPassword);
    }

    @WebMethod(operationName = "adminLogin")
    public String adminLogin(@WebParam(name = "adminId") String adminId, @WebParam(name = "encryptedPassword") String encryptedPassword) {
        return ejbRef.adminLogin(adminId, encryptedPassword);
    }

    @WebMethod(operationName = "accountInfo")
    public JSONObject accountInfo(@WebParam(name = "email") String email) {

        ArrayList<String> al = ejbRef.accountInfo(email);
        JSONObject jo = new JSONObject();
        jo.put("memberId", al.get(0));
        jo.put("name", al.get(1));
        jo.put("email", al.get(2));
        jo.put("gender", al.get(3));

        return jo;
    }

    @WebMethod(operationName = "adminAccountInfo")
    public JSONObject adminAccountInfo(@WebParam(name = "adminId") String adminId) {
        ArrayList<String> al = ejbRef.accountInfo(adminId);
        JSONObject jo = new JSONObject();
        jo.put("adminId", al.get(0));
        jo.put("phoneNum", al.get(1));

        return jo;
    }

    @WebMethod(operationName = "memberList")
    public List<JSONObject> memberList() {
        List<AccountEntity> memberList = ejbRef.memberList();
        JSONArray ja = new JSONArray();

        for (AccountEntity member : memberList) {
            JSONObject jo = new JSONObject();
            jo.put("email", member.getEmail());
            jo.put("name", member.getName());
            jo.put("activeCode", member.getGender());
            ja.add(jo);
        }
        return ja;
    }

    @WebMethod(operationName = "blockMember")
    public boolean blockMember(@WebParam(name = "email") String email) {
        return ejbRef.blockMember(email);
    }

    @WebMethod(operationName = "memberChangePassword")
    public boolean memberChangePassword(@WebParam(name = "email") String email, @WebParam(name = "oldEncryptedPassword") String oldEncryptedPassword, @WebParam(name = "newEncryptedPassword") String newEncryptedPassword) {
        return ejbRef.memberChangePassword(email, oldEncryptedPassword, newEncryptedPassword);
    }

    @WebMethod(operationName = "adminChangePassword")
    public boolean adminChangePassword(@WebParam(name = "adminId") String adminId, @WebParam(name = "oldEncryptedPassword") String oldEncryptedPassword, @WebParam(name = "newEncryptedPassword") String newEncryptedPassword) {
        return ejbRef.adminChangePassword(adminId, oldEncryptedPassword, newEncryptedPassword);
    }

    @WebMethod(operationName = "memberResetPassword")
    public String memberResetPassword(@WebParam(name = "email") String email, @WebParam(name = "newGeneratedPassword") String newGeneratedPassword) {
        return ejbRef.memberResetPassword(email, newGeneratedPassword);
    }

    @WebMethod(operationName = "checkPurchaseHistory")
    public List<PurchaseEntity> checkPurchaseHistory(@WebParam(name = "email") String email) {
        List<PurchaseEntity> purchaseList = ejbRef.checkPurchaseHistory(email);

        JSONArray ja = new JSONArray();

        for (PurchaseEntity purchase : purchaseList) {
            JSONObject jo = new JSONObject();
            jo.put("purchaseId", purchase.getId());
            jo.put("purchasePrice", purchase.getTotalPrice());
            jo.put("purchaseDate", purchase.getPurchasedDate());
//            jo.put("purchaseItem", purchase);
//            jo.put("purchaseQuantity", purchase);
            ja.add(jo);
        }
        return ja;
    }

//    @WebMethod(operationName = "checkTransactionHistory")
//    public List<TransactionEntity> checkPurchaseHistory(@WebParam(name = "email") String email) {
//         List<TransactionEntity> transactionList = ejbRef.checkTransactionHistory(email);  
//         
//          JSONArray ja = new JSONArray();
//
//        for (TransactionEntity transaction : transactionList) {
//            JSONObject jo = new JSONObject();
//            jo.put("transactionId", transaction.getId());
//            ja.add(jo);
//        }
//        return ja;
//    }
    
    
    @WebMethod(operationName = "deletePurchaseHistory")
    public boolean deletePurchaseHistory(@WebParam(name = "purchaseId") Long purchaseId) {
        return  ejbRef.deletePurchaseHistory(purchaseId);
        }
}