/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author anujakale
 */
public class WorkQueue {
    
    //ArrayList
    private ArrayList<WorkRequest> workRequestList;

    //WorkQueue Directory
    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    //ArrayList
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}