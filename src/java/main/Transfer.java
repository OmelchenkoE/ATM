/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.math.BigInteger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author qwerty
 */
@ManagedBean
@ApplicationScoped
public class Transfer {
    public static BigInteger recipientCartId;
    public static int send;

    public BigInteger getRecipientCartId() {
        return recipientCartId;
    }

    public void setRecipientCartId(BigInteger recipientCartId) {
        this.recipientCartId = recipientCartId;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }
    
}
