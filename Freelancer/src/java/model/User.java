/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Akshar
 */
public class User {
    
    private String UID;
    private String mailid;
    private String fname;
    private String lname;
    private String password;
    private String user_type;
    
    public String getUID()
    {
        return UID;
    }
    public String getMailID()
    {
        return mailid;
    }public String getName()
    {
        return fname+","+lname;
    }public String getPassword()
    {
        return password;
    }public String getUserType()
    {
        return user_type;
    }
    
    
    public void setUID(String uid)
    {
        this.UID = uid;
    }
    public void getMailID(String mid)
    {
        this.mailid = mid;
    }public void getName(String fn,String ln)
    {
        this.fname = fn;
        this.lname = ln;
    }public void getPassword(String pwd)
    {
        this.password = pwd;
    }public void getUserType(String ut)
    {
        this.user_type =ut;
    }
    
    
}
