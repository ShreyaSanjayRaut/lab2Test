/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author shrey
 */
public class Patient {
    private String patientId;
    private String primaryDoctor;

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public Date getNextAppointmentDate() {
        return nextAppointmentDate;
    }

    public void setNextAppointmentDate(Date nextAppointmentDate) {
        this.nextAppointmentDate = nextAppointmentDate;
    }
    private Date lastVisitDate;
    private Date nextAppointmentDate;
    private Boolean hasAllergies;
    private Boolean onMedication;

    public Boolean getHasAllergies() {
        return hasAllergies;
    }

    public void setHasAllergies(Boolean hasAllergies) {
        this.hasAllergies = hasAllergies;
    }

    public Boolean getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(Boolean onMedication) {
        this.onMedication = onMedication;
    }

    // Getter and Setter for patientId
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // Getter and Setter for primaryDoctor
    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    
    // Getter and Setter for allergies
    

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", primaryDoctor='" + primaryDoctor + '\'' +
                ", lastVisitDate='" + lastVisitDate + '\'' +
                ", nextAppointmentDate='" + nextAppointmentDate + '\'' +
                ", allergies='" + hasAllergies + '\'' +
                ", onMedication='" + onMedication + '\'' +
                '}';
    }
}

