package com.dbtest.demotest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "slotMachines", uniqueConstraints = @UniqueConstraint(name = "UniqueCasino", columnNames = { "fk_casino_id", "slotNumber" }))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SlotMachine implements ModelBase, Serializable {
    @Id
    @Column(name="slotId")
    @SequenceGenerator(name = "slotMachinesIdGen", sequenceName = "slotMachines_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "slotMachinesIdGen")
    private Integer id;

    @Column(name = "slotNumber")
    private Integer slotNumber;

    @Column(name = "game")
    private String gameName;

    @Column(name ="paymentDispersion")
    private double paymentDispersion;

    @Column(name = "cashRemains")
    private double cashRemains;


    @ManyToOne(targetEntity = CasinoBuilding.class)
    @JoinColumn(name="fk_casino_id",  referencedColumnName="casino_id")
    private CasinoBuilding casinoBuildingSlot;

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

    public CasinoBuilding getCasinoBuildingSlot() {
        return casinoBuildingSlot;
    }

    public void setCasinoBuildingSlot(CasinoBuilding casinoBuildingSlot) {
        this.casinoBuildingSlot = casinoBuildingSlot;
    }
}
