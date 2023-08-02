package com.spincoders.cropmaster.controller;

import com.spincoders.cropmaster.model.Chemical;
import com.spincoders.cropmaster.model.ChemicalUsage;
import com.spincoders.cropmaster.service.ChemicalUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chemicalusage")
@CrossOrigin
public class ChemicalUsageController {

    @Autowired
    private ChemicalUsageService chemicalUsageService;

    @PostMapping("/addNew")
    public String add(@RequestBody ChemicalUsage chemicalUsage) {
        chemicalUsageService.saveChemicalUsage(chemicalUsage);
        return "New Chemical is added";
    }

    @GetMapping("/getAll")
    public List<ChemicalUsage> getAllDiseases(){
        return chemicalUsageService.getAllChemicalUsage();
    }

}
