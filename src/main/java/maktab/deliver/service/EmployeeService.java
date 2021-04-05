package maktab.deliver.service;

import maktab.deliver.models.Employee;
import maktab.deliver.models.EmployeeDao;

public class EmployeeService {
    private static EmployeeDao employeeDao;

    public static void save(Employee employee){
        employeeDao.saveEmployee(employee);
    }

    public static Employee getByUser(String user){
        return employeeDao.getEmployeeByUser(user);
    }

    public static Employee getByPass(String pass){
        return employeeDao.getEmployeeByPass(pass);
    }
}
