/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AccountOfUser;

import Business.Employee.Employee;
import Business.AssignedRole.AssignedRoles;
import Business.AssignedWorkQueue.QueueofWork;

/**
 *
 * @author anujakale
 */
public class AccountOfUser {
    
    private String username;
    private String password;
    private Employee employee;
    private AssignedRoles role;
    private QueueofWork workQueue;

    public AccountOfUser() {
        workQueue = new QueueofWork();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AssignedRoles getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(AssignedRoles role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public QueueofWork getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}