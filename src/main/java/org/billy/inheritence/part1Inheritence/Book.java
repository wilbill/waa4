package org.billy.inheritence;

import jakarta.persistence.Entity;

@Entity //children dont need ids
public class Book extends Product{
    private String title;
}
