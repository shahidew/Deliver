package maktab.deliver.filter;

import maktab.deliver.models.CustomerDao;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "CustomerFilter")
public class CustomerFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer=response.getWriter();

        String userName = request.getParameter("user");
        String email = request.getParameter("email");

        CustomerDao customerDao = new CustomerDao();
        if(customerDao.getCustomerByUser(userName) != null){
            if(customerDao.getCustomerByEmail(email) != null){
                chain.doFilter(request, response);
            }
            else {
                writer.println("the email already existed");
                request.getRequestDispatcher("/sinup.html").include(request,response);
            }
        }
        else {
            writer.println("the user already existed");
            request.getRequestDispatcher("/sinup.html").include(request,response);
        }

        writer.println("</html></body>");
        writer.close();
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
