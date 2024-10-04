package org.billy.inheritence.part1Inheritence;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="orders") //overrides table name order w/c is an sql statement
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name="order_cust")
    private Customer customer;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)  //its uni and it uses a join table by default, just renaming. LAZY too
    @JoinTable(name="order_orderLines")
    private List<OrderLine>orderLines;
}
