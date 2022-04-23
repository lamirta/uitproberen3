package nl.novi.uitproberen2.models;

import javax.persistence.*;

public class Product {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Double price;



}
