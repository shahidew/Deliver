package maktab.deliver.servlet;

import maktab.deliver.models.Customer;
import maktab.deliver.models.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CustomerServlet")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer=response.getWriter();

        String name = request.getParameter("fname");
        String family = request.getParameter("lname");
        String userName = request.getParameter("user");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Long postalCode = Long.valueOf(request.getParameter("postal"));
        String password = request.getParameter("pass");

        Customer customer = new Customer(name,family,userName,email,phone,address,postalCode,password);
        CustomerDao customerDao = new CustomerDao();
        customerDao.saveCustomer(customer);
        writer.println("<p>Hello </p>" + name + "<p> Welcome to Delivery site</p>");
        writer.println("<p>Your User Name : </p>" + userName);


        request.getRequestDispatcher("/customer.html").include(request,response);
        writer.println("</html></body>");
        writer.close();
        //response.sendRedirect("list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
