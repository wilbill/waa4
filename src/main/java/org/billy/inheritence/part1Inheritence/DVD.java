package org.billy.inheritence;

import jakarta.persistence.Entity;

@Entity //children dont need ids
public class DVD extends Product{
    private String genre;
}
