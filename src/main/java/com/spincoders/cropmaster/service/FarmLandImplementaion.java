package com.spincoders.cropmaster.service;

import com.spincoders.cropmaster.model.Farmland;
import com.spincoders.cropmaster.repositary.FarmLandRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmLandImplementaion implements FarmLandService{

    @Autowired
    private FarmLandRepositary farmLandRepositary;

    @Override
    public Farmland saveFarmland(Farmland farmland) {
        return farmLandRepositary.save(farmland);
    }

    @Override
    public List<Farmland> getAllFarmLand() {
        return farmLandRepositary.findAll();
    }

    @Override
    public List<Farmland> getCropFarmland(String nic) {
        return farmLandRepositary.findCropLand(nic);
    }

    @Override
    public List<Farmland> getUncropFarmland(String nic) {
        return farmLandRepositary.findUncropLand(nic);
    }

    @Override
    public Farmland updateAssignedCrop(int farmlandId, int cropId) {
        Farmland farmland = farmLandRepositary.findById(farmlandId).orElse(null);
        if (farmland != null) {
            // Update the assigned crop
            farmland.setCropID(cropId);
            return farmLandRepositary.save(farmland);
        }
        return null;
    }
}
