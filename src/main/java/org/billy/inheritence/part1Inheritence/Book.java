package org.billy.inheritence.part1Inheritence;

import jakarta.persistence.Entity;

@Entity //children dont need ids
public class Book extends Product{
    private String title;
}
