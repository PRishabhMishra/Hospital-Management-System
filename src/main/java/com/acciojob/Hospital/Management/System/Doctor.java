package com.acciojob.Hospital.Management.System;

public class Doctor {
    private String name;

    private int docId;

    private int age;

    private String degree;

    private String specialization;

    private String location;

    private int experience;


    public Doctor(String name,int docId, int age, String degree, String specialization, String location, int experience) {
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

    public int getDocId() {
        return docId;
    }

    public int getAge() {
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

    public int getExperience() {
        return experience;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public void setAge(int age) {
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

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
