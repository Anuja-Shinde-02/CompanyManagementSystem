/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AssignedWorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class QueueofWork {
    
    private ArrayList<RequestedWork> workRequestList;

    public QueueofWork() {
        workRequestList = new ArrayList();
    }

    public ArrayList<RequestedWork> getWorkRequestList() {
        return workRequestList;
    }
}