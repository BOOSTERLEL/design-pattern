package org.pzd.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", department : " + department + ", salary :"
                + salary + " ]");
    }
}
