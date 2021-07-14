package com.dbtest.demotest.model.DTO;

public class CasinoBuildingDTO {


    private String adress;


    private Integer buildingNumber;


    private Integer fk_company_id;

    public Integer getFk_company_id() {
        return fk_company_id;
    }

    public void setFk_company_id(Integer fk_company_id) {
        this.fk_company_id = fk_company_id;
    }



    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
