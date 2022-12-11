/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AccountOfUser;

import Business.Employee.Employee;
import Business.AssignedRole.AssignedRoles;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author anujakale
 */
public class AccountOfUserDirectory {
    
    private ArrayList<AccountOfUser> userAccountList;

    public AccountOfUserDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<AccountOfUser> getUserAccountList() {
        return userAccountList;
    }
    
    public AccountOfUser getUserAccount(String username) {
        for (AccountOfUser ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }
        return null;
    }
    
    public AccountOfUser authenticateUser(String username, String password){
        for (AccountOfUser ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public AccountOfUser createUserAccount(String username, String password, Employee employee, AssignedRoles role){
        AccountOfUser userAccount = new AccountOfUser();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (AccountOfUser ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteUserAccount(AccountOfUser inputUserAcc) {
        Iterator<AccountOfUser> ir = userAccountList.iterator();
        while (ir.hasNext()) {
            AccountOfUser ua = ir.next();
            if (ua.getUsername().equals(inputUserAcc.getUsername())) {
                ir.remove();
            }
        }
    }
    
     public void editUserAccount(String oldName, String newusername, String pwd) {
        for (AccountOfUser ua : userAccountList) {
            if (ua.getUsername().equals(oldName)) {
               ua.setUsername(newusername);
               ua.setPassword(pwd);
            }
        }
    }
}
