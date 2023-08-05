package com.spincoders.cropmaster.controller;

import com.spincoders.cropmaster.model.Disease;
import com.spincoders.cropmaster.model.Owner;
import com.spincoders.cropmaster.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/addNew")
    public String add(@RequestBody Owner owner) {
        ownerService.saveOwner(owner);
        return "New Owner is added";
    }

}
