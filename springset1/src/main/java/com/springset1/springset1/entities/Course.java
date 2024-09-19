package com.springset1.springset1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class Course {
    @Id
    private long id;
    private String title;
    private String description;


    public Course() {

    }
}