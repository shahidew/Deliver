package maktab.deliver.servlet;

import maktab.deliver.models.CustomerDao;
import maktab.deliver.models.Employee;
import maktab.deliver.models.EmployeeDao;
import maktab.deliver.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginEmployeeServlet")
public class LoginEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username =request.getParameter("user");
        String password=request.getParameter("pass");


        Employee employee1 = EmployeeService.getByUser(username);
        Employee employee2 = EmployeeService.getByPass(password);

        if(employee1 != null){
            if(employee2 != null){
                if(employee1.equals(employee2)){
                    out.print("<div>Welcome, <div>" + employee1.getName());
                    HttpSession session = request.getSession(true);
                    session.setAttribute("user",username);
                    session.setAttribute("pass",password);
                    request.getRequestDispatcher("/employee.html").include(request,response);
                }
                else {
                    out.print("<div>Sorry, username or password error!<div>");
                    request.getRequestDispatcher("/loginEmployee.html").include(request, response);
                }
            }
            else {
                out.print("<div>Sorry, password is not exist!<div>");
                request.getRequestDispatcher("/loginEmployee.html").include(request, response);
            }
        }
        else {
            out.print("<div>Sorry, username is not exist!<div>");
            request.getRequestDispatcher("/loginEmployee.html").include(request, response);
        }

        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
