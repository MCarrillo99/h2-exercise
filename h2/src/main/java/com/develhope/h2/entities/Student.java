package com.develhope.h2.entities;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String surname;

    private String email;
}
