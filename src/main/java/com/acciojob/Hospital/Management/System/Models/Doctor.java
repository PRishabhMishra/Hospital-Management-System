package com.acciojob.Hospital.Management.System.Models;

public class Doctor {
    private String name;

    private Integer docId;

    private Integer age;

    private String degree;

    private String specialization;

    private String location;

    private Integer experience;


    public Doctor(String name,Integer docId, Integer age, String degree, String specialization, String location, Integer experience) {
        this.name = name;
        this.docId = docId;
        this.age = age;
        this.degree = degree;
        this.specialization = specialization;
        this.location = location;
        this.experience = experience;
    }

    public String getName() {

        return name;
    }

    public Integer getDocId() {

        return docId;
    }

    public Integer getAge() {

        return age;
    }

    public String getDegree() {

        return degree;
    }

    public String getSpecialization() {

        return specialization;
    }

    public String getLocation() {

        return location;
    }

    public Integer getExperience() {

        return experience;
    }


    public void setName(String name) {

        this.name = name;
    }

    public void setDocId(Integer docId) {

        this.docId = docId;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public void setDegree(String degree) {

        this.degree = degree;
    }

    public void setSpecialization(String specialization) {

        this.specialization = specialization;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public void setExperience(Integer experience) {

        this.experience = experience;
    }
}
