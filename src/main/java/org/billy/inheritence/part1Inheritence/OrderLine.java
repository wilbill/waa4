package org.billy.inheritence.part1Inheritence;

import jakarta.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    @ManyToOne //uni and uses join column by default
    private Product product;
}
