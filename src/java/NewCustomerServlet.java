import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /* Get parameters from user and store them in String variables */
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String streetAddress = request.getParameter("streetAddress");
        String cityAddress = request.getParameter("cityAddress");
        String stateAddress = request.getParameter("stateAddress");
        String zipCode = request.getParameter("zipCode");
        String emailAddress = request.getParameter("emailAddress");
        
        /* Unnecessary array (at this point) to store user info */
        String[] newCustomer;
        newCustomer = new String[]{firstName, lastName, phone, streetAddress, cityAddress, stateAddress, zipCode, emailAddress};
        
        /* Declare variables to be used for display message and URL */
        String url = "/index.html";
        String emptyMessage;
        
        /* If user does not fill out at least one section of the form,
            display a message telling the user to do so on New_customer page.
            If they fill all forms, go to the Success page. */
        if (firstName == null || lastName == null || phone == null || 
                streetAddress == null || cityAddress == null || 
                stateAddress == null || zipCode == null || 
                emailAddress == null || firstName.isEmpty() || 
                lastName.isEmpty() || phone.isEmpty() || 
                streetAddress.isEmpty() || cityAddress.isEmpty() || 
                stateAddress.isEmpty() || zipCode.isEmpty() || emailAddress.isEmpty()){
            emptyMessage = "Please fill out all forms.";
            url = "/New_customer.jsp";
        }
        else {
            emptyMessage = "";
            url = "/Success.html" ;
        }

        
    }


}
