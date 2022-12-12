/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author anujakale
 */

public abstract class WorkRequest {

    private String message;
    private UserAccount receiver;
    private UserAccount sender;
    private String status;
    private Date resolveDate;
    private Date requestDate;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    //getters and setters 
    public String getMessage() {
        return message;
    }

    //getters and setters 
    public void setMessage(String message) {
        this.message = message;
    }

    //getters and setters 
    public UserAccount getReceiver() {
        return receiver;
    }

    //getters and setters 
    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    //getters and setters 
    public UserAccount getSender() {
        return sender;
    }

    //getters and setters 
    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    //getters and setters 
    public String getStatus() {
        return status;
    }

    //getters and setters 
    public void setStatus(String status) {
        this.status = status;
    }

    //getters and setters 
    public Date getResolveDate() {
        return resolveDate;
    }

    //getters and setters 
    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    //getters and setters 
    public Date getRequestDate() {
        return requestDate;
    }

    //getters and setters 
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
}
