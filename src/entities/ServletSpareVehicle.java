package entities;

import Utilities.JDBCHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by palchurl on 7/24/2017.
 */
@WebServlet(name = "ServletSpareVehicle")
public class ServletSpareVehicle extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter()

                ;
       pw.print("entered");
        String sid=request.getParameter("sid");
        String who=request.getParameter("who");
        pw.print("hello");
        System.out.println("String"+sid);
        sid.trim();
        int i=Integer.parseInt(sid);
        System.out.print("int val"+i);

        String price=request.getParameter("price");
        System.out.print(price);
        String units=request.getParameter("units");
        String vmodel=request.getParameter("vmodel");

        pw.print("hello");
        Connection con = null;
        PreparedStatement ps = null;
        //ResultSet rs = null;
        try{
            con = JDBCHelper.getConnection();
            con.setAutoCommit(false);
            //SpareParts sp = findSparePart(sparePart.getSparepart_ID());
            //if(sp == null) {
            String sql = "insert into vehicle (id,vehicle_model,price,who,units) values (?,?,?,?,?)";
            //System.out.print("insert into spareparts values (""+sid,sname,price,tax,units,vmodel)");
            ps = con.prepareStatement(sql);
            System.out.print("helll");

            ps.setInt(1, i);
            ps.setString(2, vmodel);
            // System.out.print("helo"+i);

            ps.setDouble(3,Double.parseDouble(price) );

            ps.setString(4, who);
            ps.setInt(5,Integer.parseInt(units));

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
                    "                <li ><a  href=\"selectVehicle.jsp\">AddVehicle</a></li>\n" +
                    "                <li ><a  href=\"\">delete Vehicle</a></li>\n" +
                    "                <li ><a  href=\"\">View Vehicle Details</a></li>\n" +
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
            System.out.print("addedd");
        } catch (SQLException e) {
            System.out.println("OOPs error occured in connecting database " + e.getMessage());
            //    return false;
        } finally {
            //JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(con);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
