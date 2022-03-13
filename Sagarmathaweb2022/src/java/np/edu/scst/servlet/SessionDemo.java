
package np.edu.scst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           String name=(String)request.getParameter("name");
           HttpSession session= request.getSession();
           session.setAttribute("username",name);
           
           PrintWriter out=response.getWriter();
           out.println("session successfully saved");
           out.println("<a href='getsession'>Click me to access session</a>");
    }
}
