/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author drist
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> history;

    public EmployeeDirectory(){
        this.history = new ArrayList<Employee>();  
    }
    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    public Employee addNewEmployees(){ 
            
    Employee newEmployee = new Employee();
    history.add(newEmployee);
    return newEmployee;
    
    }
    
    public void deleteEmployees(Employee ed) {
        history.remove(ed);
    }
}
