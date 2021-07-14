package com.dbtest.demotest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "casino_List", schema = "public", uniqueConstraints = @UniqueConstraint(name = "UniqueCompanyAndNumber", columnNames = { "fk_companyId", "casino_number" }))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CasinoBuilding implements ModelBase, Serializable {
    @Id
    @Column(name="casino_id")
    @SequenceGenerator(name = "casinoIdSeq", sequenceName = "casino_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "casinoIdSeq")
    private Integer id;

    @Column(name="adress")
    private String adress;

    @Column(name= "casino_number")
    private Integer  buildingNumber;

    @ManyToOne(targetEntity = Company.class)
    @JoinColumn(name="fk_companyId", referencedColumnName="companyID")
    private Company CBcompany;

    @OneToMany(mappedBy = "casinoBuildingWorker", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Worker> workerList;

    @OneToMany(mappedBy = "casinoBuildingSlot", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SlotMachine> slotMachineList;

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
    public String toString() {
        return String.format(
                "id " + id.toString() + System.lineSeparator() +
                        adress + System.lineSeparator()  +
                        "Building Number: " + buildingNumber + System.lineSeparator()


        );
    }
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


    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    public List<SlotMachine> getSlotMachineList() {
        return slotMachineList;
    }

    public void setSlotMachineList(List<SlotMachine> slotMachineList) {
        this.slotMachineList = slotMachineList;
    }

    public Company getCBcompany() {
        return CBcompany;
    }

    public void setCBcompany(Company CBcompany) {
        this.CBcompany = CBcompany;
    }
}
