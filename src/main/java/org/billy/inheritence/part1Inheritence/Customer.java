package org.billy.inheritence;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    //lazy by default
    private List<Order> orderList;


}
