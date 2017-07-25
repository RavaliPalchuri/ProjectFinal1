package DAO;

import Utilities.JDBCHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by palchurl on 7/19/2017.
 */
@WebServlet(name = "ServletRemoveSpare")
public class ServletRemoveSpare extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id=request.getParameter("sid");
int i=Integer.parseInt(id);
        Connection con = null;
        PreparedStatement ps = null;
        //ResultSet rs = null;
        try{
            con = JDBCHelper.getConnection();
            con.setAutoCommit(false);

            String sql = "DELETE from spareparts WHERE sparepartid="+i;

            ps = con.prepareStatement(sql);
            System.out.print("deleted");
ps.executeUpdate();
            con.commit();
            System.out.print("DELETE from spareparts WHERE sparepartid="+i);

        } catch (SQLException e) {
            System.out.println("OOPs error occured in connecting database " + e.getMessage());

        } finally {

            JDBCHelper.close(ps);
            JDBCHelper.close(con);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
