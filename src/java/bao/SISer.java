/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao;

import conn.DBhelper;
import dao.SIBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class SISer extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try
        {
        PrintWriter out = response.getWriter();
        SIBean obj = new SIBean();
        obj.setP(Float.parseFloat(request.getParameter("txtp")));
        obj.setR(Float.parseFloat(request.getParameter("txtr")));
        obj.setT(Float.parseFloat(request.getParameter("txtt")));
        DBhelper.createConnection();
       int x= DBhelper.dmlOperation("insert into tbl_si(p,r,t) value('"+obj.getP()+"','"+obj.getR()+"','"+obj.getT()+"')");
      if(x!=0)
          out.print("data inserted successfully");
        float si =( obj.getP()*obj.getR()*obj.getT())/100;
        out.print("result is "+si);
        }
        catch(Exception ex)
        {
            
        }
        
    }

    

}
