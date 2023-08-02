package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "weather")
public class Weather {

    @Id
    private int farmlandID;

    @Column(name = "temperature")
    private String temperature;

    @Column(name = "rainfall")
    private String rainfall;

    @Column(name = "humidity")
    private String humidity;

    @Column(name = "windspeed")
    private String windspeed;

    @Column(name = "radiation")
    private String radiation;

}
