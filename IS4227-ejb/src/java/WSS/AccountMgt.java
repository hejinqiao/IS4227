/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Entity.AccountMgt.AccountEntity;
import Entity.AccountMgt.PurchaseEntity;
import SessionBean.AccountMgtBean;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.JSONArray;
import org.json.JSONObject;

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

    @WebMethod(operationName = "changePassword")
    public boolean changePassword(@WebParam(name = "email") String email, @WebParam(name = "newPwd") String newPwd) {
        return ejbRef.changePassword(email, newPwd);
    }

    @WebMethod(operationName = "editAccountInfo")
    public JSONObject editAccountInfo(@WebParam(name = "email") String email, @WebParam(name = "first") String first, @WebParam(name = "last") String last, @WebParam(name = "address") String address, @WebParam(name = "contactNumber") String contactNumber) {

        ArrayList<String> al = ejbRef.editAccountInfo(email, first + ", " + last, address, contactNumber);
        JSONObject jo = new JSONObject();
        jo.put("first", al.get(0));
        jo.put("last", al.get(1));
        jo.put("email", al.get(2));
        jo.put("address", al.get(3));
        jo.put("contactNumber", al.get(4));

        return jo;
    }

    @WebMethod(operationName = "registerAccount")
    public boolean registerAccount(@WebParam(name = "email") String email, @WebParam(name = "password") String password, @WebParam(name = "first") String firstName, @WebParam(name = "last") String lastName, @WebParam(name = "gender") String gender) {

        return ejbRef.registerAccount(email, password, firstName + ", " + lastName, gender);
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

    @WebMethod(operationName = "testlogin")
    public String testlogin(@WebParam(name = "email") String email, @WebParam(name = "encryptedPassword") String encryptedPassword) {

        String result = ejbRef.memberLogin(email, encryptedPassword);
        return result;
    }

    @WebMethod(operationName = "adminLogin")
    public String adminLogin(@WebParam(name = "adminId") String adminId, @WebParam(name = "encryptedPassword") String encryptedPassword) {
        return ejbRef.adminLogin(adminId, encryptedPassword);
    }

    @WebMethod(operationName = "accountInfo")
    public String accountInfo(@WebParam(name = "email") String email) {

        ArrayList<String> al = ejbRef.accountInfo(email);
        JSONObject jo = new JSONObject();
        jo.put("first", al.get(0));
        jo.put("last", al.get(1));
        jo.put("email", al.get(2));
        jo.put("address", al.get(3));
        jo.put("contactNumber", al.get(4));

        return jo.toString();
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
    public String memberList() {
        List<AccountEntity> memberList = ejbRef.memberList();
        JSONArray ja = new JSONArray();

        for (AccountEntity member : memberList) {
            JSONObject jo = new JSONObject();
            jo.put("accountId", member.getId());
            jo.put("email", member.getEmail());
            jo.put("name", member.getName());
            jo.put("activeCode", member.getGender());
            jo.put("isBlock", member.getIsBlocked());
            jo.put("isMember", member.getIsMember());
            jo.put("isDeleted",member.getIsDeleted());
            ja.put(jo);
        }
        return ja.toString();
    }

    @WebMethod(operationName = "blockMember")
    public boolean blockMember(@WebParam(name = "email") String email) {
        return ejbRef.blockMember(email);
    }

    @WebMethod(operationName = "unblockMember")
    public boolean unblockMember(@WebParam(name = "email") String email) {
        return ejbRef.unblockMember(email);
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
    public String checkPurchaseHistory(@WebParam(name = "email") String email) {
        List<PurchaseEntity> purchaseList = ejbRef.checkPurchaseHistory(email);

        JSONArray ja = new JSONArray();

        for (PurchaseEntity purchase : purchaseList) {
            JSONObject jo = new JSONObject();
            jo.put("purchaseId", purchase.getId());
            jo.put("purchasePrice", purchase.getTotalPrice());
            jo.put("purchaseDate", purchase.getPurchasedDate());
//            jo.put("purchaseItem", purchase);
//            jo.put("purchaseQuantity", purchase);
            ja.put(jo);
        }
        return ja.toString();
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
        return ejbRef.deletePurchaseHistory(purchaseId);
    }

    /**
     * Web service operation
     * @param accountId
     * @return 
     */
    @WebMethod(operationName = "deleteAccount")
    public boolean deleteAccount(@WebParam(name = "accountId") String accountId) {
        //TODO write your implementation code here:
        boolean result = ejbRef.deleteAccount(Long.valueOf((accountId)));
        return result;
    }
}
