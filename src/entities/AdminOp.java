package entities;

import DAO.OperatorDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by donuric on 7/20/2017.
 */
@WebServlet(name="AdminOp")
public class AdminOp extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("Operation done Successfully");
        String un = (String) request.getParameter("oname");
        String password = (String) request.getParameter("opass");
        OperatorDaoImpl operator = new OperatorDaoImpl();
        operator.addOpertor(new Operator(un, password, true));
        out.println("<form action=\"LogoutAdmin\" method=\"get\">");
        out.println("<p align=\"right\"><input type=\"submit\" value=\"LOGOUT\" /><p>");
        out.println("</form>");
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}

