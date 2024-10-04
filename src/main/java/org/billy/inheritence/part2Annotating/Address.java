package org.billy.inheritence.part2Annotating;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name="STREET")
    private String street;
    @Column(name="CITY")
    private String city;
    @Column(name="ZIP")
    private String zip;
}
