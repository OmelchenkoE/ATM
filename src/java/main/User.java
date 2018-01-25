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
import javax.faces.bean.SessionScoped;

/**
 *
 * @author qwerty
 */
@ManagedBean
@SessionScoped
public class User {

    /**
     * Creates a new instance of User
     */
    public static String username;
    public static String password;
   
// чтоб присваевался номер карты по имени пользователя
//    public BigInteger User() {
//        if (username == "user1") {
//            BigInteger cartId = new BigInteger("1234123412341324");
//            return cartId;            
//        }else{}
//        return null;
//    }
public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

   

  

}
