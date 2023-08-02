package com.spincoders.cropmaster.service;

import com.spincoders.cropmaster.model.Farmer;
import com.spincoders.cropmaster.repositary.FarmerRepositary;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerImplementation implements FarmerService{

    @Autowired
    private FarmerRepositary farmerRepositary;

    @Override
    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepositary.save(farmer);
    }

    @Override
    public List<Farmer> getAllFarmers() {
        return farmerRepositary.findAll();
    }
}
