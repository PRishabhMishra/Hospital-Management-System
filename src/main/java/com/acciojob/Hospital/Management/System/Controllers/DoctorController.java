package com.acciojob.Hospital.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ServiceLayer serviceObj;

    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody Doctor doctor){
        String result = serviceObj.addDoctor(doctor);
        return result;

    }
    @GetMapping("/getDoc")
    public String getDocNameWithMaxExp(){
        String name = serviceObj.getDocNameWithMaxExp();
        return name;

    }

    @GetMapping("/getDocListWithDegree")
        public List<Doctor>getDocListWithDegree(@RequestParam("degree")String degree){

        List<Doctor> doctors = serviceObj.getListOfDoctor(degree);
        return doctors;

        }


}
