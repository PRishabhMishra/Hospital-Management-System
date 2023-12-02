package com.acciojob.Hospital.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // this will tell spring this is service layer and logic is written  here

public class ServiceLayer {
    @Autowired
    private RepositoryLayer RepoObj;

    public String addDoctor(Doctor doctor){

        //this is where some data processing is done
        String result = RepoObj.addDoctorToDb(doctor);
        return result;

    }

    public String getDocNameWithMaxExp(){

        List<Doctor> doctorList = RepoObj.getAllDoctor();
        int exp = 0;
        String docName = "";
        for(Doctor doctor : doctorList){
            if(doctor.getExperience()==exp){
                if(doctor.getName().compareTo(docName)<0){
                    docName = doctor.getName();
                }
            }
            if(doctor.getExperience() > exp){
                exp = doctor.getExperience();
                docName = doctor.getName();
            }
        }
        return docName;
    }

    public List<Doctor> getListOfDoctor(String degree){

        List<Doctor> doctorList = RepoObj.getAllDoctor();
        List<Doctor> finalList = new ArrayList<>();

        for(Doctor doctor : doctorList){
            if(doctor.getDegree().equals(degree)){
                finalList.add(doctor);
            }
        }
        return finalList;
    }
}
