
package np.edu.scst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=(String)request.getParameter("name");//from bata j aii ra ko ho tyo tani ra ko ho
        String email=(String)request.getParameter("email");
        PrintWriter out=response.getWriter();// web page ma kehi display garauna PrintWriter ko object chaincha
        out.println("hello"+name+"your email is"+email);      
    }


}
