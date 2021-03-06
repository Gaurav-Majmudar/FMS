/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akshar
 */
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String theAction = request.getParameter("action");
        
        if ( theAction == null)
            theAction = "loginuser";

        ViewHelper action = getActionFromConfig( theAction );

        String view = action.execute(request, response);
         
        RequestDispatcher rd = request.getRequestDispatcher(view);
        rd.forward(request, response);    
    }
    
    
    
    private ViewHelper getActionFromConfig( String theAction ) 
            throws IOException {
        Properties map = new Properties();
        map.load( this.getClass().getClassLoader().getResourceAsStream( ACTION_MAPPING ));
            
        String action_class = map.getProperty( 
                theAction.toLowerCase() );      
        ViewHelper action = null;
        try {
            action = (ViewHelper) Class.forName( action_class ).newInstance();
        }
        catch(Exception e) {
            action = (ViewHelper) new Error( e );
        }
        return action;
    }

    private final static String ACTION_MAPPING = "controller/ViewHelperMapProperties.properties"; 



    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
