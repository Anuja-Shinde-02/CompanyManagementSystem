/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;


import java.util.ArrayList;
import java.util.Iterator;
import Business.Employee.Employee;
import Business.Role.Role;

/**
 *
 * @author anujakale
 */
public class UserAccountDirectory {
    
    //ArrayList
    private ArrayList<UserAccount> userAccountList;

    //UserAccountDirectory
    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    //ArrayList
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    //getter
    public UserAccount getUserAccount(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    //check user
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
     //edit user 
    public void editUserAccount(String oldName, String newusername, String pwd) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(oldName)) {
               ua.setUsername(newusername);
               ua.setPassword(pwd);
            }
        }
    }
     
    //delete user
    public void deleteUserAccount(UserAccount inputUserAcc) {
        Iterator<UserAccount> ir = userAccountList.iterator();
        while (ir.hasNext()) {
            UserAccount ua = ir.next();
            if (ua.getUsername().equals(inputUserAcc.getUsername())) {
                ir.remove();
            }
        }
    }
}
