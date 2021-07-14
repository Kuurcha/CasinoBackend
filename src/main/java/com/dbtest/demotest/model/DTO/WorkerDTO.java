package com.dbtest.demotest.model.DTO;

import java.util.Date;

public class WorkerDTO {
    private String occupation;


    private String fullName;


    private double salary;


    private Date dateOfBirth;

    private Integer fk_casino_id;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getFk_casino_id() {
        return fk_casino_id;
    }

    public void setFk_casino_id(Integer fk_casino_id) {
        this.fk_casino_id = fk_casino_id;
    }
}
