package maktab.deliver.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Column(name="First Name")
    private String name;

    @Column(name = "Last Name")
    private String family;

    @Id
    @Column(name = "User Name" ,unique = true)
    private String userName;

    @Column(name="Email", unique=true)
    private String email;

    @Column(name="Phone Number", unique = true)
    private Number phone;

    @Column(name="Address")
    private String address;

    @Column(name="Postal Code")
    private Number postalCode;

    @Column(name="Password", unique = true)
    private String password;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Deliver.class)
    private List<Deliver> delivers = new ArrayList<Deliver>();

    public List<Deliver> getDelivers() {
        return delivers;
    }

    public void setDelivers(List<Deliver> delivers) {
        this.delivers = delivers;
    }

    public Customer() {
    }

    public Customer(String name, String family, String userName, String email, Number phone, String address, Number postalCode, String password) {
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

    public String getPassword() {
        return password;
    }


}
