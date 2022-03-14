
package np.edu.scst.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=(String)request.getParameter("name");
        String email=(String)request.getParameter("email");
        System.out.println(name);
        System.out.println(email);
        Cookie cookieName=new Cookie("uname",name);
        Cookie cookieEmail=new Cookie("email",email);
        
        response.addCookie(cookieName);
        response.addCookie(cookieEmail);// mannualy cookie is set.
        
        PrintWriter out=response.getWriter();
        out.println("Cookie successfully saved.<br>");
        out.println("<a href='getcookie'>Click me to access cookie</a>");
    }
}
