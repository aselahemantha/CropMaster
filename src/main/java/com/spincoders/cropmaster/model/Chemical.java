package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Chemical")
public class Chemical {

    @Id
    @Column(name = "chemicalID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int chemicalID;

    @Column(name = "name")
    private String name;

    @Column(name = "handling")
    private String handling;

    @Column(name = "usage")
    private String usage;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "safety")
    private String safety;

    @Column(name = "envir_impact")
    private String envir_impact;


}
