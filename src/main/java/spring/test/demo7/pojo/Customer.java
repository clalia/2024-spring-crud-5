package spring.test.demo7.pojo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 64)
    private String lastname;

    @Column(nullable = false, length = 64)
    private String email;

    @Column(nullable = false, length = 64)
    private String phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> ordine;

public Customer(){
}
public Customer(String name, String lastname, String email, String phone){
    setName(name);
    setLastname(lastname);
    setEmail(email);
    setPhone(phone);
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public List<Order> getOrders() {
        return ordine;
    }

    public void setOrders(List<Order> ordine) {
        this.ordine = ordine;
    }

    public void addOrder(Order order) {
        ordine.add(order);
        order.setCustomer(this);
    }

    public void removeOrder(Order order) {
        ordine.remove(order);
        order.setCustomer(null);
    }


@Override
public String toString() {

    return "Customer{\n"
            + "id=" + id + ",\n"
            + "name=" + name + ",\n"
            + "lastname=" + lastname + ",\n"
            + "email=" + email + "\n" + "phone"+",\n}";
}
}


