package entities;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogoutAdmin")
public class LogoutAdmin extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            HttpSession session=request.getSession(false);

            out.print((String)session.getAttribute("aname")+" you have been logged out"+"<br>");
            out.println("</form method=\"get\">");
            out.println("Click here to Re-Login "+"<input type=\"button\" onclick=location.href=\"index.jsp\" value=\"LOGIN\"/>");
            out.println("</form>");

            out.close();

        }catch(Exception e){System.out.println(e);}
    }

}