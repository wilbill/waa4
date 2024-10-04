package org.billy.inheritence.part2Annotating;

import jakarta.persistence.*;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="APPDATE")
    private String appdate;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="PATIENT_ID", referencedColumnName = "ID")
    private Patient patient;
    @Embedded
    private Payment payment;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="DOCTOR_ID", referencedColumnName = "ID")
    private Doctor doctor;

}
