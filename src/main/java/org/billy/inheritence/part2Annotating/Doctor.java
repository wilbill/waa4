package org.billy.inheritence.part2Annotating;

import jakarta.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="TYPE")
    private String doctortype;
    @Column(name="FIRSTNAME")
    private String firstname;
    @Column(name="LASTNAME")
    private String lastname;

}
