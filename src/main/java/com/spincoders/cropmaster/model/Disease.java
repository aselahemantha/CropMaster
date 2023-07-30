package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

import java.awt.geom.GeneralPath;

@Entity
@Table(name="disease")
public class Disease {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "diseaseID")
    private int diseaseID;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "symptom")
    private String symptom;
}
