import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;*/

public class LoginServlet extends HttpServlet {
    
/* Declare variables to be used within doPost method */
String userNameLogin = null;
String passWordLogin = null;
String userName = "jsmith@toba.com";
String passWord = "letmein";
/*Context environmentContextUser = null;
Context environmentContextPass = null;*/

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /* Retrieve parameters from user */
        userNameLogin = request.getParameter("userNameEnter");
        passWordLogin = request.getParameter("passWordEnter");
   
        /* If username and password matches, go to account page. If not, go to failure page */
        if ((userNameLogin == userName) && (passWordLogin == passWord)){
            response.sendRedirect("/Account_activity.html");
        }
        else {
            response.sendRedirect("/Login_failure.html");
       }
            
    }
}
