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
public class project {
    
    private String PID;
    private String pname;
    private String pdesc;
    private double pbudget;
    private int duration;
    private int projcompletiondays;


    public void setPID(String pid)
    {
        this.PID = pid;
    }
    public void setPname(String pname)
    {
        this.pname = pname;
    }public void setProjDesc(String desc)
    {
        this.pdesc = desc;
    }
    public void setProjBudget(double amnt)
    {
        this.pbudget = amnt;
    }
    public void setProjDuration(int duration)
    {
        this.pname = pname;
    }public void setProjCompleteDays(int days)
    {
        this.projcompletiondays = days;
    }
    
    
    public String getPID()
    {
        return PID;
    }
    public String getPname()
    {
        return pname;
    }public String getProjDesc()
    {
        return pdesc;
    }
    public double getProjBudget()
    {
        return pbudget;
    }
    public int getProjDuration()
    {
        return duration;
    }public int getProjCompleteDays()
    {
        return projcompletiondays;
    }
    
    
    
}
