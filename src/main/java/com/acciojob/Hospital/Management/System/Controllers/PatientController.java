package com.acciojob.Hospital.Management.System.Controllers;

import com.acciojob.Hospital.Management.System.Models.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){
        return null;
    }

    @GetMapping("/getInfo")
    public Patient getPatientInfo(@RequestParam("patientId")Integer patientId){
        return null;
    }
}
