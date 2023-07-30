package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "crop")
public class Crop {

    @Id
    @Column(name = "cropID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cropId;

    @Column(name = "name")
    private String name;

    @Column(name = "variety")
    private String variety;

}
