package DAO;

import Utilities.JDBCHelper;
import entities.SpareParts;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.geom.Point2D;
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
                  //  int i=Integer.parseInt("sid");
                  //  System.out.print("value"+i);
                    ps.setInt(1, i);

               // System.out.print("helo"+i);
                    ps.setString(2, sname);
                    ps.setInt(3,Integer.parseInt(price) );

                    ps.setInt(4, Integer.parseInt(tax));
                    ps.setInt(5,Integer.parseInt(units));
                    ps.setString(6, vmodel);
                    ps.executeUpdate();

                    con.commit();
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
