package org.billy.inheritence.part2Annotating;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Embeddable
public class Payment {
    @Temporal(TemporalType.DATE)
    @Column(name="PAYDATE")
    private Date payDate;
    @Column(name="AMOUNT")
    private double amount;
}
