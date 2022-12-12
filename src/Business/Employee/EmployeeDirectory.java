/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author anujashinde
 */
public class EmployeeDirectory {
    
    //ArrayList
    private ArrayList<Employee> employeeList;

    //EmployeeDirectory
    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    //ArrayList
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    //create employee
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}