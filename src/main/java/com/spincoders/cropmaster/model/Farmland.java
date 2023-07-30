package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "farmland")
public class Farmland {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int farmlandID;

    @Column(name = "size")
    private String size;

    @Column(name = "location")
    private String location;

    @Column(name = "farmerNIC")
    private long nic;
}
