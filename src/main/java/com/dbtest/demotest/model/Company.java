package com.dbtest.demotest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.ui.Model;

import javax.persistence.*;

@Entity
@Table(name = "companies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Company implements ModelBase {
    @Id
    @Column(name="companyId")
    @SequenceGenerator(name = "companiesIdGen", sequenceName = "companies_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "companiesIdGen")
    private Integer id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "ceo")
    private String CEO;

    @Column(name = "sharePrice")
    private double sharePrice;


    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
        //this.sharePrice = Double.parseDouble(sharePrice);
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}