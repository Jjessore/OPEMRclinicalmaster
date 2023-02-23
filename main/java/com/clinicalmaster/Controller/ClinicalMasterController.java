package com.clinicalmaster.Controller;

import com.clinicalmaster.Entity.maritalStatus;
import com.clinicalmaster.Repository.MaritalStatusRepository;
import com.clinicalmaster.Service.ClinicalMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ClinicalMasterController {
    @Autowired
    MaritalStatusRepository maritalStatusRepository;
    @GetMapping("/")
    public String home(){
        return "welcome to the clinical master API";
    }
    @GetMapping("/active")
    public String home1(){
        return "A";
    }
    @GetMapping("/status")
    public List<maritalStatus> getActiveMaritalStatus(){
        return  maritalStatusRepository.findActiveMaritalStatus();

    }

}
