/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.math.BigInteger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author qwerty
 */
@ManagedBean
@ApplicationScoped
public class Controller {

    public static int balance = 1000;
    public static int limit = 5000;
    public static Transfer tr = new Transfer();
 

    public int getBalance() {
        
        balance = balance - tr.getSend();     
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public BigInteger getCartId() {
        BigInteger cartId = new BigInteger("1234123412341324");
        return cartId;
    }

}
