package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Soil")
public class Soil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int farmlandID;

    @Column(name = "temperature")
    private String temperature;

    @Column(name = "ph")
    private String ph;

    @Column(name = "structure")
    private String structure;

    @Column(name = "waterholdig")
    private String waterholding;

    @Column(name = "nutrition")
    private String nutrition;
}
