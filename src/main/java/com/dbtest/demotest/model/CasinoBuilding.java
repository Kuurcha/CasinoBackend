package com.dbtest.demotest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "casinoList")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CasinoBuilding implements ModelBase{
    @Id
    @Column(name="casino_id")
    @SequenceGenerator(name = "casinoIdSeq", sequenceName = "casino_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "casinoIdSeq")
    private Integer id;

    @Column(name="adress")
    private String adress;

    @Column(name= "casino_number")
    private Integer  buildingNumber;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer  getBuildingNumber() {
        return buildingNumber;
    }

    /*public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = Integer.parseInt(buildingNumber);
    }*/

    public void setBuildingNumber(Integer buildingNumber){
        this.buildingNumber = buildingNumber;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
