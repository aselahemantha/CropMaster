package com.spincoders.cropmaster.controller;
import com.spincoders.cropmaster.model.Farmer;
import com.spincoders.cropmaster.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer")
@CrossOrigin
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @PostMapping("/addNew")
    public String add(@RequestBody Farmer farmer) {
        farmerService.saveFarmer(farmer);
        return "New Farmer is added";
    }

    @GetMapping("/getAll")
    public List<Farmer> getAllFarmers(){
        return farmerService.getAllFarmers();
    }

}
