package org.billy.inheritence.part2Annotating;

import jakarta.persistence.*;

@Entity
@SecondaryTable(name="address",
                pkJoinColumns = @PrimaryKeyJoinColumn(name="patient_id",
                referencedColumnName="id"))
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    private String name;
    @Column(table = "address", name="STREET")
    private String street;
    @Column(table = "address", name="ZIP")
    private String zip;
    @Column(table = "address", name="CITY")
    private String city;
}
