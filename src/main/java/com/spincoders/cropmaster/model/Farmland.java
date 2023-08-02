package com.spincoders.cropmaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "farmland")
public class Farmland {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int farmlandID;

    @Column(name = "name")
    private String name;

    @Column(name = "size")
    private String size;

    @Column(name = "location")
    private String location;

    @Column(name = "farmerNIC")
    private String nic;

    @Column(name = "cropID")
    private int cropID;

    public Farmland() {
    }

    public int getFarmlandID() {
        return farmlandID;
    }

    public void setFarmlandID(int farmlandID) {
        this.farmlandID = farmlandID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getCropID() {
        return cropID;
    }

    public void setCropID(int cropID) {
        this.cropID = cropID;
    }
}
