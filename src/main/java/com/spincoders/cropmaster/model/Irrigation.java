package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Irrigation")
public class Irrigation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int systemID;

    @Column(name = "delivery")
    private String delivery;

    @Column(name = "source")
    private String source;

    @Column(name = "method")
    private String method;

    @Column(name = "farmlandID")
    private String farmlandID;

    @Column(name = "maintainerNIC")
    private String maintainerNIC;
}
