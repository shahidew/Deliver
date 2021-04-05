package maktab.deliver.service;

import maktab.deliver.models.Customer;
import maktab.deliver.models.CustomerDao;
import maktab.deliver.models.Deliver;

public class CustomerService {
    private static CustomerDao customerDao;

    public static void save(Customer customer){
        customerDao.saveCustomer(customer);
    }

    public static Customer getByUser(String user){
        return customerDao.getCustomerByUser(user);
    }

    public static Customer getByPass(String pass){
        return customerDao.getCustomerByPass(pass);
    }
}
