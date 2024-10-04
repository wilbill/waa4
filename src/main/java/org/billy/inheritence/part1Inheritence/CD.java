package org.billy.inheritence;

import jakarta.persistence.Entity;

@Entity //children dont need ids
public class CD extends Product {
    private String artist;
}
