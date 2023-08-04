package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name="machineryusage")
public class MachineryUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="machineryusageID")
    private int machineryusageID;

    @Column(name = "nic")
    private String nic;

    @Column(name = "farmlandID")
    private int farmlandID;

    @Column(name = "machineryID")
    private int machineryID;

    public MachineryUsage() {
    }

    public int getMachineryusageID() {
        return machineryusageID;
    }

    public void setMachineryusageID(int machineryusageID) {
        this.machineryusageID = machineryusageID;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getFarmlandID() {
        return farmlandID;
    }

    public void setFarmlandID(int farmlandID) {
        this.farmlandID = farmlandID;
    }

    public int getMachineryID() {
        return machineryID;
    }

    public void setMachineryID(int machineryID) {
        this.machineryID = machineryID;
    }
}
