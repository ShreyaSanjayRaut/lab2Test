/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class Driver {
    private String fullName; // Change the attribute name to fullName
    private String age; // Change the data type to String
    private String licenseNumber;

    // Constructor
    

    // Getter and Setter for fullName
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter and Setter for age
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    // Getter and Setter for licenseNumber
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}

