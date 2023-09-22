/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class Doctor {
    private String name;
    private String workCity;
    private String doctorId;
    private String specialization;
    private String education;
    private int annualIncome;
    private int consultationFee;

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }
    

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for workCity
    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    // Getter and Setter for doctorId
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    // Getter and Setter for specialization
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getter and Setter for education
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    // Getter and Setter for annualIncome
    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", workCity='" + workCity + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", specialization='" + specialization + '\'' +
                ", education='" + education + '\'' +
                ", annualIncome='" + annualIncome + '\'' +
                
                '}';
    }
}

