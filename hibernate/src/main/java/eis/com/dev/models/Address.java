package eis.com.dev.models;

import javax.persistence.*;

@Entity(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String street;
    private int appartaments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAppartaments() {
        return appartaments;
    }

    public void setAppartaments(int appartaments) {
        this.appartaments = appartaments;
    }

    public Address() {

    }

    public Address(String street, int appartaments) {
        this.street = street;
        this.appartaments = appartaments;
    }
}
