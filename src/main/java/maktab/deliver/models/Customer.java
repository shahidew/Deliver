package maktab.deliver.models;

import sun.security.util.Password;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String family;
    private String userName;
    private String email;
    private Number phone;
    private String address;
    private Number postalCode;
    private Password password;
    private List<Deliver> delivers = new ArrayList<Deliver>();

    public List<Deliver> getDelivers() {
        return delivers;
    }

    public void setDelivers(List<Deliver> delivers) {
        this.delivers = delivers;
    }

    public Customer() {
    }

    public Customer(String name, String family, String userName, String email, Number phone, String address, Number postalCode, Password password) {
        this.name = name;
        this.family = family;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.postalCode = postalCode;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public Number getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Number getPostalCode() {
        return postalCode;
    }

    public Password getPassword() {
        return password;
    }


}
