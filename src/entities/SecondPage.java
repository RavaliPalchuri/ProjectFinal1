package entities;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by donuric on 7/21/2017.
 */
@WebServlet(name="SecondPage")
public class SecondPage extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession(false);
        out.print("hellooooo");
       /* out.println("<p align=\"center\">Welcome "+session.getAttribute("aname")+"</p>");
        out.println("<br>");
        out.println("<form action=\"AdminOp\" method=\"post\">");
        out.println("<table align=\"center\" border=1>");
        out.println("<th><h4>Add Operators Details....!!!</h4></th>");
        out.println("<tr><td>ENTER OPERATOR USERNAME : <input type=\"text\" name=\"oname\"/></td></tr>");
        out.println("<tr><td>ENTER OPERATOR PASSWORD : <input type=\"text\" name=\"opass\"/></td></tr>");
        out.println("<tr><td align=\"right\"><input type=\"submit\" value=\"REGISTER\"/></td></tr>");
        out.println("</table>");
        out.println("</form>");
        out.println("<form action=\"LogoutAdmin\" method=\"get\">");
        out.println("<p align=\"right\"><input type=\"submit\" value=\"LOGOUT\" /><p>");
        out.println("</form>");*/
       out.print("<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
               "\n" +
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
               "                <li ><a  href=\"select.jsp\" class=\"selected\">Spareparts</a></li>\n" +
               "                <li ><a  href=\"removespare.jsp\" class=\"selected\">delete Spare</a></li>\n" +
               "                <li ><a  href=\"Findspare.jsp\" class=\"selected\">View Spare Details</a></li>\n" +
               "                <li><a  href=\"LogoutAdmin\" class=\"selected\">Logout</a></li>\n" +
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
               "            <form action=\"AdminOp\" method=\"post\">\n" +
               "                <div class=\"form_settings\">\n" +
               "\n" +
               "                    <p><br> <b><span>Enter the operator username</span></b></span>\n" +
               "                        <input type=\\\"text\\\" name=\\\"oname\\\"/>\n" +
               "                    </p>\n" +
               " <p><br> <b><span>Enter the operator password</span></b></span>\n"+
               "                        <input type=\\\"password\\\" name=\\\"opass\\\"/>\n" +
                       "                    </p>\n" +
               "\n" +
               "                    <p style=\"padding-top: 15px\">\n" +
               "                        <span>&nbsp;</span><input class=\"submit\" type=\"submit\"\n" +
               "                                                  name=\"contact_submitted\" value=\"submit\" />\n" +
               "                    </p>\n" +
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

    }
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

    }
}
