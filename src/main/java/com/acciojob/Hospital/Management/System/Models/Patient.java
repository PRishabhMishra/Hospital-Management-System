package com.acciojob.Hospital.Management.System.Models;

public class Patient {

    private Integer patientId;
    private String patientName;
    private Integer age;
    private String disease;

    public Patient(Integer patientId, String patientName, Integer age, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public Integer getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
