package com.spincoders.cropmaster.controller;

import com.spincoders.cropmaster.model.Disease;
import com.spincoders.cropmaster.model.Farmer;
import com.spincoders.cropmaster.model.Owner;
import com.spincoders.cropmaster.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/owner")
@CrossOrigin
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/addNew")
    public String add(@RequestBody Owner owner) {
        ownerService.saveOwner(owner);
        return "New Owner is added";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> loginData) {
        String nic = loginData.get("nic");
        String password = loginData.get("password");

        ResponseEntity<String> response = ownerService.authenticateOwner(nic, password);
        return response;
    }

    @GetMapping("/{nic}")
    public ResponseEntity<Owner> getFarmerByNic(@PathVariable String nic) {
        Owner owner = ownerService.findByNic(nic);

        if (owner != null) {
            return ResponseEntity.ok(owner);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
