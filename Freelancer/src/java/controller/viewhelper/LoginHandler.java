/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.viewhelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akshar
 */
public class LoginHandler implements controller.ViewHelper{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
      String view="";
      String mailid=req.getParameter("mail");
      String pass=req.getParameter("pass");
      if(mailid.equals("mistry.aks@gmail.com") && pass.equals("123"))
      {
          view="newjsp.jsp";
      }
      else
      {
          view = "newhtml.html";
      }
      
        
        return view;
    }
    
}
