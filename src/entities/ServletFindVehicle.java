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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by palchurl on 7/24/2017.
 */
@WebServlet(name = "ServletFindVehicle")
public class ServletFindVehicle extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PrintWriter pw = response.getWriter();
        String n = request.getParameter("sid");
//findSparePart(n);

        try {
            con = JDBCHelper.getConnection();
            String sql = "Select * from vehicle where id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(n));
            ps.execute();
            rs = ps.getResultSet();

            if(rs.next()) {


                pw.print("\n" +
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
                        "                <li ><a  href=\"\">delete </a></li>\n" +
                        "                <li ><a  href=\"FindVehicle.jsp\">View Vehicle Details</a></li>\n" +
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
                        "                <div class=\"sidebar_base\"></div>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "        <div id=\"content\">\n" +
                        "\n" +
                        "            <br /> <br /> <br /> <br />\n" +
                        "\n" +
                        "            <form action=\"ServletSpare\" method=\"get\">\n" +
                        "                <div class=\"form_settings\">\n" +
                        "\n" +
                        "                    <p><br> <b><span>vid</span></b></span>\n" +
                        rs.getString("id")+"\n" +
                        "                    </p>\n" +
                        "                    <p><br> <b><span>who</span></b></span>\n" +
                        rs.getString("who")+"\n" +
                        "                    </p>\n" +

                        "                   <p> <br> <span><b>price</b></span></p>\n" +
                        rs.getDouble("price")+"\n" +
                        "                    </br></p>\n" +
                        "                    <p><br><span><b>units</b></span>\n" +
                        rs.getInt("units")+"</p>\n" +
                        "                   <p> <br><span><b>vehiclemodel</b></span>\n" +
                        rs.getString("vehicle_model")+"</p>\n" +
                        "                </div>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "            </form>\n" +
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
                        "\n" +
                        "\n");




//   pw.print("<table><tr><td>sid</td><td >"+rs.getString("sparepartid")+"</td></tr>"+"<tr><td>Sparename</td><td>"+rs.getString("sparepartName")+"</td></tr>"+"<tr><td>vehiclemode</td><td>"+rs.getString("vehicle_model")+"</td></tr>"+"<tr><td>price</td><td>"+rs.getDouble("price")+"</td></tr>"+"<tr><td>units</td><td>"+rs.getInt("units")+"</td></tr>");


            }
            else{
                //return null;
            }

        } catch (SQLException e) {
            System.out.print("Data Base Error"+e.getMessage());
            //return null;
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(con);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
