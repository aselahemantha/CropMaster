package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "HostCrop")
public class HostCrop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hostcropID;

    @Column(name = "farmlandID")
    private int farmlandID;

    @Column(name = "diseaseID")
    private int diseaseID;

    @Column(name = "nic")
    private String nic;



    public HostCrop() {
    }

    public int getHostcropID() {
        return hostcropID;
    }

    public void setHostcropID(int hostcropID) {
        this.hostcropID = hostcropID;
    }

    public int getFarmlandID() {
        return farmlandID;
    }

    public void setFarmlandID(int farmlandID) {
        this.farmlandID = farmlandID;
    }

    public int getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(int diseaseID) {
        this.diseaseID = diseaseID;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
