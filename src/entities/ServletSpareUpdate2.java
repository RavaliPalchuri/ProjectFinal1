package entities;

import Utilities.JDBCHelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by palchurl on 7/23/2017.
 */
@WebServlet(name = "ServletSpareUpdate2")
public class ServletSpareUpdate2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//String n1=s.n;
        Connection con=null;
        Statement st=null;
        PrintWriter pw = response.getWriter();
        try {con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","CDKcdk11");
            // PreparedStatement ps = null;
             st=con.createStatement();
            String n = request.getParameter("sid");
            System.out.print("n value "+n);
             ResultSet rs=null;
            String sql = "select sparepartid from spareparts where sparepartid= "+n;
            rs=st.executeQuery(sql);
            System.out.println(rs);
           // System.out.println(rs.next());
            boolean k=rs.next();
             if(k==true) {
System.out.print("enetered");
                 String price = request.getParameter("price");
                 String tax = request.getParameter("tax");
                 String units = request.getParameter("units");
             //    String n = request.getParameter("sid");

                 System.out.print(price + "  " + tax + " " + units + " " + n);
                 System.out.print(n);
                 String sql1 = "update spareparts set price = '" + price + "' where sparepartid = " + n;
                 String sql2 = "update spareparts set  tax = '" + tax + "'  where sparepartid = " + n;
                 String sql3 = "update spareparts set  units ='" + units + "'   where sparepartid =  " + n;
                 System.out.print(sql1);
                 System.out.print(sql2);
                 System.out.print(sql3);

                 st.executeUpdate(sql1);
                 st.executeUpdate(sql2);
                 st.executeUpdate(sql3);

                 System.out.print("done");
                 pw.print("\n" +
                         "\n" +
                         "<%-- Created by IntelliJ IDEA. --%>\n" +
                         "<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                         "\n" +
                         "\n" +
                         "\n" +
                         "\n" +
                         "\n" +
                         "\n" +
                         "\n" +
                         "<%-- Created by IntelliJ IDEA. --%>\n" +
                         "<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                         "\n" +
                         "<!DOCTYPE HTML>\n" +
                         "\n" +
                         "<html>\n" +
                         "\n" +
                         "<head>\n" +
                         "    <meta name=\"description\" content=\"website description\" />\n" +
                         "    <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n" +
                         "    <meta http-equiv=\"content-type\"\n" +
                         "          content=\"text/html; charset=windows-1252\" />\n" +
                         "    <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\n" +
                         "\n" +
                         "</head>\n" +
                         "\n" +
                         "<body>\n" +
                         "<div id=\"main\">\n" +
                         "    <div id=\"header\">\n" +
                         "        <div id=\"logo\">\n" +
                         "            <div id=\"logo_text\">\n" +
                         "                <br /> <br /> <font size=\"5\"><span\n" +
                         "                    class=\"logo_colour\">\n" +
                         "\t\t\t\t\t\t\tProject Work</a></font>\n" +
                         "            </div>\n" +
                         "        </div>\n" +
                         "        <div id=\"menubar\">\n" +
                         "            <ul id=\"menu\">\n" +
                         "\n" +
                         "                <li class=\"selected\"><a  href=\"Order.jsp\">Back</a></li>\n" +
                         "                <li ><a  href=\"select.jsp\">Spareparts</a></li>\n" +
                         "                <li ><a  href=\"removespare.jsp\">delete Spare</a></li>\n" +
                         "                <li ><a  href=\"Findspare.jsp\">View Spare Details</a></li>\n" +
                         "                <li><a  href=\"index.jsp \">Logout</a></li>\n" +
                         "\n" +
                         "            </ul>\t\t\t</div>\n" +
                         "    </div>\n" +
                         "    <div id=\"content_header\"></div>\n" +
                         "    <div id=\"site_content\">\n" +
                         "        <div id=\"sidebar_container\">\n" +
                         "            <br /> <br /> <br /> <br />\n" +
                         "            <div class=\"sidebar\">\n" +
                         "                <div class=\"sidebar_top\"></div>\n" +
                         "\n" +
                        " <h3>Pics</h3>\n"+
"                    <ul>\n"+
"                        <li><img src=\"vehiclehire1.jpg\" width=\"172\" height=\"220\"></li>\n"+


"                  </ul>\n"+

                         "</div>"+
                         "                <div class=\"sidebar_base\"></div>\n" +
                         "            </div>" +
                         "                    <p> <h3><span>Updated Succesfully</span></h3></span>\n" +
                         "        </div>\n" +
                         "        <div id=\"content\">\n" +
                         "\n" +

                         "            <br /> <br /> <br /> <br />\n" +
                         "\n" +

                         "\n" +
                         "                <div class=\"form_settings\">\n" +
                         "\n" +


                         "                    </p>\n" +
                         "                </div>\n" +
                         "\n" +
                         "\n" +
                         "\n" +

                         "\n" +
                         "\n" +
                         "\n" +
                         "        </div>\n" +
                         "    </div>\n" +
                         "    <br /> <br /> <br /> <br />\n" +
                         "    <div id=\"content_footer\"></div>\n" +
                         "    <div id=\"footer\">\n" +
                         "        <p></p>\n" +
                         "    </div>\n" +
                         "</div>\n" +
                         "</body>\n" +
                         "</html>\n" +
                         "\n");
                 // ps.executeUpdate();
                 con.commit();
             }
             else{
                 pw.println("such id doesnot exist");
             }
//            }

        } catch (SQLException e) {
            System.out.println("OOPs error occured in connecting database " + e.getMessage());

        } finally {
            //JDBCHelper.close(rs);
         JDBCHelper.close(con);
           JDBCHelper.close(st);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
