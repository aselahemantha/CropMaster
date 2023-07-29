package com.spincoders.cropmaster.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Farmer")
public class Farmer {

    @Id
    @Column(name = "nic")
    private long nic;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "experince")
    private String experince;
}
