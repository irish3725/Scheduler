/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.util.LinkedList;

/**
 *
 * @author alex
 */
public class Scheduler {

    public static WindowManager w = new WindowManager();
    public static Frame f1 = new Frame();
    public static EmployeeOptions f2 = new EmployeeOptions();
    public static LinkedList employeeList = new LinkedList();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WindowManager w = new WindowManager();
        Employee e1 = new Employee("Elliot");
        Employee e2 = new Employee("Alex");
        Employee e3 = new Employee("Preston");
        Employee e4 = new Employee("Cameran");
        Employee e5 = new Employee("Abby");
        Employee e6 = new Employee("Julianne");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
    }
    
    
}
