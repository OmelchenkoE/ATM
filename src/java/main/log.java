/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author qwerty
 */
@ManagedBean
@ApplicationScoped
public class log {
public static ArrayList<String> list;
    public static ArrayList<String> log() {
       // =null;
        String m = null;
        Transfer tr1 = new Transfer();
        User us = new User();
        Controller con = new Controller();
        if (list == null) {
            list = new ArrayList<String>();
            String str = "Your login: " + us.getUsername() + "/ Your invioce id: " + con.getCartId() + "/ Sum:" + tr1.getSend() + "/ Transfer to: " + tr1.getRecipientCartId();
            list.add(str);
        } else {
            String str = "Your login: " + us.getUsername() + "Your invioce id: " + con.getCartId() + "/ Sum:" + tr1.getSend() + "/ Transfer to: " + tr1.getRecipientCartId();
            list.add(str);
        }
            m = list.toString();
            System.err.println(m);//проверка1
            System.err.println("LOGIN" + us.getUsername());//проверка2
        
        return list;
    }
}
