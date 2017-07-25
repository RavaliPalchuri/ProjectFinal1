package entities;

import Utilities.JDBCHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by palchurl on 7/19/2017.
 */
@WebServlet(name = "ServletSpare")
public class ServletSpare extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //RequestDispatcher re=request.getRequestDispatcher("select.jsp");
        //re.include(request,response);
    /* PrintWriter pw=response.getWriter();
        pw.print(" <form action=\"ServletSpare\" method=\"get\"><br> <label>sparepartId<b></b></label>\n" +
                "        <input type=\"text\" name=\"sid\" required>\n" +
                "        </br>\n" +
                "        <br> <label><b>sparepartName</b></label>\n" +
                "        <input type=\"text\"  name=\"sname\" required></br>\n" +
                "        <br> <label><b>price</b></label>\n" +
                "        <input type=\"text\"  name=\"price\" required>\n" +
                "        </br>\n" +
                "        <br>\n" +
                "        <label><b>tax</b></label>\n" +
                "        <input type=\"text\"  name=\"tax\" required>\n" +
                "        </br>\n" +
                "        <br><label><b>units</b></label>\n" +
                "        <input type=\"text\" name=\"units\" required></br>\n" +
                "        <br><label><b>vehiclemodel</b></label>\n" +
                "        <input type=\"text\" name =\"vmodel\"></br>\n" +
                "        <div class=\"clearfix\">\n" +
                "            <input type=\"submit\" value=\"submit\">\n" +
                "        </div></form>");
*/
        String sname=request.getParameter("sname");
        String sid=request.getParameter("sid");
        System.out.println("String"+sid);
        sid.trim();
        int i=Integer.parseInt(sid);
        System.out.print("int val"+i);
        String tax=request.getParameter("tax");
        System.out.print("helloooo");
      String price=request.getParameter("price");
        System.out.print(price);
        String units=request.getParameter("units");
        String vmodel=request.getParameter("vmodel");
        PrintWriter pw=response.getWriter()
                ;
            Connection con = null;
            PreparedStatement ps = null;
            //ResultSet rs = null;
            try{
                con = JDBCHelper.getConnection();
               con.setAutoCommit(false);
               //SpareParts sp = findSparePart(sparePart.getSparepart_ID());
                //if(sp == null) {
                    String sql = "insert into spareparts (sparepartid,sparepartName,price,tax,units,vehicle_model) values (?,?,?,?,?,?)";
                //System.out.print("insert into spareparts values (""+sid,sname,price,tax,units,vmodel)");
                    ps = con.prepareStatement(sql);
                    System.out.print("helll");

                    ps.setInt(1, i);

               // System.out.print("helo"+i);
                    ps.setString(2, sname);
                    ps.setInt(3,Integer.parseInt(price) );

                    ps.setInt(4, Integer.parseInt(tax));
                    ps.setInt(5,Integer.parseInt(units));
                    ps.setString(6, vmodel);
                    ps.executeUpdate();

                    con.commit();
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
                        "                <br /> <br /> <font size=\"5\"><a href=\"index.html\"><span\n" +
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
                        "                    <p> <h3><span>Added Succesfully</span></h3></span>\n" +
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
                           } catch (SQLException e) {
                System.out.println("OOPs error occured in connecting database " + e.getMessage());
            //    return false;
            } finally {
                //JDBCHelper.close(rs);
                JDBCHelper.close(ps);
                JDBCHelper.close(con);
            }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
