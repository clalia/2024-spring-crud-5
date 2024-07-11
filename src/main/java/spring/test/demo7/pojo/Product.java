package spring.test.demo7.pojo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int vat;

    @ManyToMany(mappedBy = "products")
    private List<Order> ordine;

    public Product(){}

    public Product(String name, int price, int vat){
        setName(name);
        setPrice(price);
        setVat(vat);
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }
    public List<Order> getOrders() {
        return ordine;
    }

    public void setOrders(List<Order> ordine) {
        this.ordine = ordine;
    }

    public int getFullPrice(boolean includeVat) {
        if (includeVat) {
            return price + (price * vat / 100);
        } else {
            return price;
        }
    }
}


