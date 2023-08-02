package com.spincoders.cropmaster.service;

import com.spincoders.cropmaster.model.Farmer;

import java.util.List;


public interface FarmerService {

    public Farmer saveFarmer(Farmer farmer);

    public List<Farmer> getAllFarmers();
}
