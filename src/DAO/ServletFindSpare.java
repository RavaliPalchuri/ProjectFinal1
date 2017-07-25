package DAO;

import Utilities.JDBCHelper;
import entities.SpareParts;

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
 * Created by palchurl on 7/19/2017.
 */
@WebServlet(name = "ServletFindSpare")
public class ServletFindSpare extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PrintWriter pw = response.getWriter();
        String n = request.getParameter("sid");
//findSparePart(n);

        try {
            con = JDBCHelper.getConnection();
            String sql = "Select * from spareparts where sparepartId = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, n);
            ps.execute();
            rs = ps.getResultSet();
            if(rs.next()) {
                pw.print("<table><tr><td>sid</td><td >"+rs.getString("sparepartid")+"</td></tr>"+"<tr><td>Sparename</td><td>"+rs.getString("sparepartName")+"</td></tr>"+"<tr><td>vehiclemode</td><td>"+rs.getString("vehicle_model")+"</td></tr>"+"<tr><td>price</td><td>"+rs.getDouble("price")+"</td></tr>"+"<tr><td>units</td><td>"+rs.getInt("units")+"</td></tr>");


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
   /* public void findSparePart(String sparePartId) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = JDBCHelper.getConnection();
            String sql = "Select * from spareparts where sparepartId = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, sparePartId);
            ps.execute();
            rs = ps.getResultSet();
            if(rs.next()) {
               // SpareParts sp = new SpareParts(rs.getString("sparepartid"), rs.getString("sparepartName"), rs.getString("vehicle_model"), rs.getDouble("price"), rs.getDouble("tax"), rs.getInt("units"));
                //return sp;

            }
            else{
                //return null;
            }

        } catch (SQLException e) {
            System.out.print("Data Base Error"+e.getMessage());
            return null;
        } finally {
            JDBCHelper.close(rs);
            JDBCHelper.close(ps);
            JDBCHelper.close(con);
        }
    }
*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
