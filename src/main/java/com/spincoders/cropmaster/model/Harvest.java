package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Harvest")
public class Harvest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int methodID;

    @Column(name = "method")
    private String method;

    @Column(name = "time")
    private String time;

    @Column(name = "cost")
    private String cost;

}
