package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Machinery")
public class Machinery {

    @Id
    @Column(name = "machineID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int machineID;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "cost")
    private String cost;

    @Column(name = "envir_impact")
    private String envir_impact;

    @Column(name = "safely")
    private String safely;


}

