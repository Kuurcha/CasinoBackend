package com.dbtest.demotest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "casinoList")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CasinoBuilding implements ModelBase{
    @Id
    @Column(name="casinoId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="adress")
    private String adress;

    @Column(name= "number")
    private Number buildingNumber;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Number getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Number buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
