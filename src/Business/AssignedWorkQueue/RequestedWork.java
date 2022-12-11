/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AssignedWorkQueue;

import Business.AccountOfUser.AccountOfUser;
import java.util.Date;

/**
 *
 * @author anujakale
 */
public abstract class RequestedWork {

    private String message;
    private AccountOfUser sender;
    private AccountOfUser receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public RequestedWork(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AccountOfUser getSender() {
        return sender;
    }

    public void setSender(AccountOfUser sender) {
        this.sender = sender;
    }

    public AccountOfUser getReceiver() {
        return receiver;
    }

    public void setReceiver(AccountOfUser receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
