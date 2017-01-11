/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

/**
 *
 * @author alex
 */
public class WindowManager {

    
           
    
    public WindowManager() {
        Frame f1 = new Frame();
        EmployeeOptions f2 = new EmployeeOptions();
        f1.setVisible(true);
    }
    
    public void openEmployeeOptions(){
        Scheduler.f2.setVisible(true);
        Scheduler.f1.setVisible(false);
    }
}
