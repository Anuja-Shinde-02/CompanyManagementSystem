/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employees;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeesDirectory {
    
    private ArrayList<Employees> employeeList;

    public EmployeesDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employees> getEmployeeList() {
        return employeeList;
    }
    
    public Employees createEmployee(String name){
        Employees employee = new Employees();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}