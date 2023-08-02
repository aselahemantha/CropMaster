package com.spincoders.cropmaster.service;

import com.spincoders.cropmaster.model.Farmer;
import com.spincoders.cropmaster.model.Farmland;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FarmLandService {

    public Farmland saveFarmland(Farmland farmland);

    public List<Farmland> getAllFarmLand();

    public List<Farmland> getCropFarmland(String nic);

    public List<Farmland> getUncropFarmland(String nic);

    public Farmland updateAssignedCrop(int farmlandId, int cropId);

}
