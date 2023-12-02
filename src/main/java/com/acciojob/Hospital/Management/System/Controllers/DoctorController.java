package com.acciojob.Hospital.Management.System.Controllers;

import com.acciojob.Hospital.Management.System.Models.Doctor;
import com.acciojob.Hospital.Management.System.Services.DoctorServiceLayer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorServiceLayer serviceObj;

    @GetMapping
    public void getLogs(){
        log.error("This is error message ");
        log.warn("This is warning message");
        log.info("This is an information");
        log.debug("This is debug message");
        log.trace("This is trace message");
    }

    @PostMapping("/add")
    public ResponseEntity addDoctor(@RequestBody Doctor doctor){
        log.info("We have got the request doctor {}" , doctor);
        String result = serviceObj.addDoctor(doctor);
        return new  ResponseEntity(result, HttpStatus.CREATED);

    }
    @GetMapping("/getDoc")
    public ResponseEntity getDocNameWithMaxExp(){
        log.info("We are in the getDocc Name with maxExp");
        String name = serviceObj.getDocNameWithMaxExp();
        if(name == ""){
            return new ResponseEntity(name, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(name,HttpStatus.OK);

    }

    @GetMapping("/getDocListWithDegree")
        public List<Doctor>getDocListWithDegree(@RequestParam("degree")String degree){

        List<Doctor> doctors = serviceObj.getListOfDoctor(degree);
        return doctors;

        }


}
