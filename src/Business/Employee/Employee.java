/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author anujashinde
 */
public class Employee {
    
    private int id;
    private String name;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    //getter and setter
    public void setName(String name) {
        this.name = name;
    }

    //getter and setter
    public String getName() {
        return name;
    }
    
    //getter and setter
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
