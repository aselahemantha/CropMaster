package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Storage")
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storageID;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "humidity")
    private String humidity;

    @Column(name = "temperature")
    private String temperature;
}
