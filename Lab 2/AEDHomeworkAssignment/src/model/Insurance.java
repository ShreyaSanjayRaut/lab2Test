/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class Insurance {
    private String companyId;
    private String location;
    private double installment;
    private double deductible;
    private String benefitsStatement;

   

    // Getter and Setter for companyId
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    // Getter and Setter for workLocation
    public String getWorkLocation() {
        return location;
    }

    public void setWorkLocation(String location) {
        this.location = location;
    }

    // Getter and Setter for installment
    public double getInstallment() {
        return installment;
    }

    public void setInstallment(double installment) {
        this.installment = installment;
    }

    // Getter and Setter for deductible
    public double getDeductible() {
        return deductible;
    }

    public void setDeductible(double deductible) {
        this.deductible = deductible;
    }

    // Getter and Setter for benefitsStatement
    public String getBenefitsStatement() {
        return benefitsStatement;
    }

    public void setBenefitsStatement(String benefitsStatement) {
        this.benefitsStatement = benefitsStatement;
    }

    @Override
    public String toString() {
        return "HealthInsuranceCompany{" +
                "companyId='" + companyId + '\'' +
                ", location='" + location + '\'' +
                ", installment='" + installment + '\'' +
                ", deductible='" + deductible + '\'' +
                ", benefitsStatement='" + benefitsStatement + '\'' +
                '}';
    }
}

