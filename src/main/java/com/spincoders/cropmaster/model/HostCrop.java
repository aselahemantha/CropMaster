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

    @Column(name = "chemicalID")
    private int chemicalID;

    @Column(name = "machineID")
    private int machineID;

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

    public int getChemicalID() {
        return chemicalID;
    }

    public void setChemicalID(int chemicalID) {
        this.chemicalID = chemicalID;
    }

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
}
