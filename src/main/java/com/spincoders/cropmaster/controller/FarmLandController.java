package com.spincoders.cropmaster.controller;

import com.spincoders.cropmaster.model.Farmer;
import com.spincoders.cropmaster.model.Farmland;
import com.spincoders.cropmaster.service.FarmLandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmland")
@CrossOrigin
public class FarmLandController {

    @Autowired
    private FarmLandService farmLandService;

    @PostMapping("/addNew")
    public String add(@RequestBody Farmland farmland) {
        farmLandService.saveFarmland(farmland);
        return "New FarmLand is added";
    }

    @GetMapping("/getAll")
    public List<Farmland> getAllFarmLands(){
        return farmLandService.getAllFarmLand();
    }

    @GetMapping("/croped/{nic}")
    public List<Farmland> getCropedFarmlands(@PathVariable String nic) {
        return farmLandService.getCropFarmland(nic);
    }

    @GetMapping("/uncroped/{nic}")
    public List<Farmland> getUncropedFarmlands(@PathVariable String nic) {
        return farmLandService.getUncropFarmland(nic);
    }

    @PutMapping("/updateCrop/{farmlandId}/{cropId}")
    public Farmland updateAssignedCrop(@PathVariable int farmlandId, @PathVariable int cropId) {
        return farmLandService.updateAssignedCrop(farmlandId, cropId);
    }

}
