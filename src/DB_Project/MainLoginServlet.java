package DB_Project;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by palchurl on 7/21/2017.
 */
@WebServlet(name = "MainLoginServlet")
public class MainLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String n=request.getParameter("userName");
        String p=request.getParameter("userPass");
        String jid="";
        String jnam="";
        String jid1="";
        String jnam1="";

        out.println("Before if statement");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection ct = DriverManager.getConnection("jdbc:mysql://localhost/test","root","CDKcdk11");

            Statement st = ct.createStatement();

            ResultSet rs = st.executeQuery("select * from admin");
ResultSet rs1=st.executeQuery("SELECT * from operators");
            while(rs.next())
            {
                jid = rs.getString("username");

                jnam = rs.getString("password");

                System.out.println("<br>Id:"+jid);

                System.out.println("<br>Name:"+jnam);

            }
            while(rs1.next())
            {
                jid1 = rs.getString("username");

                jnam1 = rs.getString("password");

                System.out.println("<br>Id:"+jid1);

                System.out.println("<br>Name:"+jnam1);

            }
rs1.close();
            rs.close();
            st.close();
            ct.close();
        }
        catch(Exception et)
        {
            et.printStackTrace();
        }

        if((jid.equals(n) && jnam.equalsIgnoreCase(p)))//success
        {
            System.out.print("hello");
            out.print("Logged in as admin");
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            request.setAttribute("abc", "Welcome");
            rd.forward(request,response);

        }
        else if((jid1.equals(n) && jnam1.equalsIgnoreCase(p)))
            {
//
                out.print("Logged in as Operator");
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");



            rd.forward(request, response);


            out.print("This is after include");
        }
    }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
