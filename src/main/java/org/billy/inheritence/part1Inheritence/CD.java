package org.billy.inheritence.part1Inheritence;

import jakarta.persistence.Entity;

@Entity //children dont need ids
public class CD extends Product {
    private String artist;
}
