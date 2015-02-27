/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Entity.AccountMgt.AccountEntity;
import Entity.AccountMgt.AdminAccountEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author WangTianQi
 */
@Stateless
@LocalBean
public class AccountMgtBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private EntityManager em;

    public boolean checkAccount(String email) {
        Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
        List<AccountEntity> accountList = query.getResultList();
        if (accountList == null || accountList.isEmpty()) {
            //Does not exist
            return false;
        } else {
            //Account already exits
            return true;
        }
    }

    public boolean checkAdminAccount(String adminId) {
        Query query = em.createQuery("SELECT a FROM AdminAccountEntity AS a WHERE a.adminId=:adminId").setParameter("adminId", adminId);
        List<AdminAccountEntity> adminList = query.getResultList();
        if (adminList == null || adminList.isEmpty()) {
            //Does not exist
            return false;
        } else {
            //Account already exits
            return true;
        }
    }

    public boolean registerAccount(String email, String encryptedPassword, String name, String gender) {
        if (checkAccount(email)) {
            return false;
        } else {
            AccountEntity accountEntity = new AccountEntity(email, encryptedPassword, name, gender);

            // Generate and Set Activation Code for New Member
            String activationCode = UUID.randomUUID().toString();
            accountEntity.setActivationCode(activationCode);

            em.persist(accountEntity);

            return true;
        }

    }

    public ArrayList<String> emailActivationCode(String email) {
        ArrayList<String> al = new ArrayList<String>();
        Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
        List<AccountEntity> accountList = query.getResultList();
        AccountEntity accountEntity = accountList.get(0);

        al.add(email);
        al.add(accountEntity.getName());
        al.add(accountEntity.getActivationCode());

        return al;

    }

    public String activateAccount(String email, String activationCode) {
        if (!checkAccount(email)) {
            //Account Not Exist
            return "NO";
        } else {
            Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
            List<AccountEntity> accountList = query.getResultList();
            AccountEntity accountEntity = accountList.get(0);

            //Account Already Activated
            if (accountEntity.getIsMember()) {
                return "ACTIVATED";

            } else {

                if (accountEntity.getActivationCode().equals(activationCode)) {
                    accountEntity.setIsMember(true);
                    em.flush();
                    //Account Successfully Activated
                    return "YES";
                } else {
                    //Wrong Activation Code
                    return "WRONG";
                }
            }
        }
    }

    public String memberLogin(String email, String encryptedPassword) {
        if (!checkAccount(email)) {
            return "NO";//member not found
        } else {
            Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
            List<AccountEntity> accountList = query.getResultList();
            AccountEntity accountEntity = accountList.get(0);

            if (!accountEntity.getIsBlocked()) {
                if (!accountEntity.getIsMember()) {
                    return "LOCKED";//member locked, please activate first
                } else {
                    if (accountEntity.getPassword().equals(encryptedPassword)) {
                        return "YES";//login successfully
                    } else {
                        return "WRONG";//wrong password
                    }

                }
            } else {
                return "BLOCKED";//member was blocked/deleted by admin
            }
        }
    }

    public String adminLogin(String adminId, String encryptedPassword) {
        if (!checkAdminAccount(adminId)) {
            return "NO";//admin not found
        } else {
            Query query = em.createQuery("SELECT a FROM AdminAccountEntity AS a WHERE a.adminId=:adminId").setParameter("adminId", adminId);
            List<AdminAccountEntity> adminList = query.getResultList();
            AdminAccountEntity adminEntity = adminList.get(0);

            if (adminEntity.getPassword().equals(encryptedPassword)) {
                return "YES";//login successfully
            } else {
                return "WRONG";//wrong password
            }

        }
    }

    public ArrayList<String> accountInfo(String email) {
        ArrayList<String> al = new ArrayList<String>();
        Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
        List<AccountEntity> accountList = query.getResultList();
        AccountEntity accountEntity = accountList.get(0);

        al.add("Member ID: " + accountEntity.getId());
        al.add("Name: " + accountEntity.getName());
        al.add("Email: " + accountEntity.getEmail());
        al.add("Gender: " + accountEntity.getGender());
        //al.add("Phone Number: " + accountEntity.getContactNo());

        return al;
    }

    public ArrayList<String> adminAccountInfo(String adminId) {
        ArrayList<String> al = new ArrayList<String>();
        Query query = em.createQuery("SELECT a FROM AdminAccountEntity AS a WHERE a.adminId=:adminId").setParameter("adminId", adminId);
        List<AdminAccountEntity> adminList = query.getResultList();
        AdminAccountEntity adminEntity = adminList.get(0);
        al.add("Admin ID: " + adminEntity.getId());
        // al.add("Name: " + adminEntity.getName());
        // al.add("Email: " + adminEntity.getEmail());
        al.add("Phone Number: " + adminEntity.getContactNo());
        // al.add("Department: " + adminEntity.getDepartment());

        return al;
    }

    public List<AccountEntity> memberList() {
        List<AccountEntity> al;
        Query query = em.createQuery("SELECT a FROM AccountEntity AS a ");
        al = query.getResultList();
        return al;
    }

    public boolean blockMember(String email) {
        Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
        List<AccountEntity> accountList = query.getResultList();
        AccountEntity accountEntity = accountList.get(0);
        accountEntity.setIsBlocked(true);
        em.flush();
        return true;
    }

    public boolean memberChangePassword(String email, String oldEncryptedPassword, String newEncryptedPassword) {

        Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
        List<AccountEntity> accountList = query.getResultList();
        AccountEntity accountEntity = accountList.get(0);

        if (accountEntity.getPassword().equals(oldEncryptedPassword)) {

            accountEntity.setPassword(newEncryptedPassword);
            em.flush();

            return true;

        } else {
            return false;
        }
    }

    public boolean adminChangePassword(String adminId, String oldEncryptedPassword, String newEncryptedPassword) {

        Query query = em.createQuery("SELECT a FROM AdminAccountEntity AS a WHERE a.adminId=:adminId").setParameter("adminId", adminId);
        List<AdminAccountEntity> adminList = query.getResultList();
        AdminAccountEntity adminEntity = adminList.get(0);

        if (adminEntity.getPassword().equals(oldEncryptedPassword)) {

            adminEntity.setPassword(newEncryptedPassword);
            em.flush();
            return true;

        } else {
            return false;

        }
    }

    /*
     public String currentEmail(String userId) {
     return em.find(UserEntity.class, userId).getEmail();

     }
     */
    /*
     public boolean changeEmail(String userId, String newEmail, String password) {
     userEntity = em.find(UserEntity.class, userId);
     if (userEntity.getPassword().equals(password)) {
     userEntity.setEmail(newEmail);
     em.flush();
     return true;
     } else {
     return false;
     }

     }
     */

    /*
     public String currentContactNo(String userId) {
     return em.find(UserEntity.class, userId).getContact();

     }
     */

    /*
     public boolean changeContactNo(String userId, String newContact) {
     userEntity = em.find(UserEntity.class, userId);
     if (userEntity != null) {
     userEntity.setContact(newContact);
     em.flush();
     return true;
     } else {
     return false;
     }

     }
     */
    //Forget password, so reset
    public String memberResetPassword(String email, String newGeneratedPassword) {
        if (!checkAccount(email)) {
            return "NO"; //account not exist
        } else {
            Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
            List<AccountEntity> accountList = query.getResultList();
            AccountEntity accountEntity = accountList.get(0);

            if (accountEntity.getIsBlocked()) {
                return "BLOCKED";//blocked by admin, cannot reset password
            } else {
                if (!accountEntity.getIsMember()) {
                    return "LOCKED";//not activated yet, please activate first
                } else {

                    accountEntity.setPassword(newGeneratedPassword);
                    em.flush();
                    return "YES";
                }
            }
        }
    }

}