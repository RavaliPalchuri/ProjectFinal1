package entities;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by palchurl on 7/22/2017.
 */
@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<table>");
        out.println("<tr>");
        out.println("<td>SpareParts Module</td>");
        out.println("<td>");
        out.println("<form action=\"FourthPage\" method=\"post\">");
        out.println("<input type=\"submit\" name=\"log\" value=\"Place Order\" />");
        out.println("</form>");
        out.println("</td></tr>");
        out.print("</table>");
        out.println("<td>Vehicle Module</td>");
        out.println("<td>");
        out.println("<form action=\"FourthPage\" method=\"post\">");
        out.println("<input type=\"submit\" name=\"log\" value=\"Place Order\" />");
        out.println("</form>");
        out.println("</td></tr>");
        out.print("</table>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
