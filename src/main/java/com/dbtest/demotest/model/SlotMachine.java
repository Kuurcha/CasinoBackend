package com.dbtest.demotest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "slotMachines")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SlotMachine implements ModelBase {
    @Id
    @Column(name="slotId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "slotNumber")
    private Integer slotNumber;

    @Column(name = "gameName")
    private String gameName;

    @Column(name ="paymentDispersion")
    private double paymentDispersion;

    @Column(name = "cashRemains")
    private double cashRemains;

    public double getCashRemains() {
        return cashRemains;
    }

    public void setCashRemains(double cashRemains) {
        this.cashRemains = cashRemains;
    }

    public double getPaymentDispersion() {
        return paymentDispersion;
    }

    public void setPaymentDispersion(double paymentDispersion) {
        this.paymentDispersion = paymentDispersion;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
