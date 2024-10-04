package org.billy.inheritence.part2Annotating;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Embeddable
public class Payment {
    @Temporal(TemporalType.DATE)
    private Date payDate;
    private String paydate;
    private double amount;
}
