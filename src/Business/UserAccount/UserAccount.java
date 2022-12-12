/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author anujakale
 */


public class UserAccount {
    
    private Employee employee;
    private String username;
    private String password;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    //getters and setters 
    public String getUsername() {
        return username;
    }

    //getters and setters 
    public void setUsername(String username) {
        this.username = username;
    }

    //getters and setters 
    public String getPassword() {
        return password;
    }

    //getters and setters 
    public void setPassword(String password) {
        this.password = password;
    }

    //getters and setters 
    public Role getRole() {
        return role;
    }

    //getters and setters 
    public void setRole(Role role) {
        this.role = role;
    }
    
    //getters and setters 
    public Employee getEmployee() {
        return employee;
    }

    //getters and setters 
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    //getters and setters 
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}