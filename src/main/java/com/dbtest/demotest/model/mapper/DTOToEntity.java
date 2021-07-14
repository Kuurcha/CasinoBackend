package com.dbtest.demotest.model.mapper;

import com.dbtest.demotest.model.CasinoBuilding;
import com.dbtest.demotest.model.DTO.CasinoBuildingDTO;
import com.dbtest.demotest.model.DTO.SlotMachineDTO;
import com.dbtest.demotest.model.DTO.WorkerDTO;
import com.dbtest.demotest.model.SlotMachine;
import com.dbtest.demotest.model.Worker;

public class DTOToEntity {

    public static SlotMachine SlotMachineFromDTO(SlotMachineDTO slotMachineDTO){
        SlotMachine result = new SlotMachine();
        result.setGameName(slotMachineDTO.getGameName());
        result.setCashRemains(slotMachineDTO.getCashRemains());
        result.setPaymentDispersion(slotMachineDTO.getPaymentDispersion());
        result.setSlotNumber(slotMachineDTO.getSlotNumber());
        return result;
    }
    public static Worker WorkerFromDTO(WorkerDTO workerkDTO){
        Worker result = new Worker();
        result.setDateOfBirth(workerkDTO.getDateOfBirth());
        result.setOccupation(workerkDTO.getOccupation());
        result.setFullName(workerkDTO.getFullName());
        result.setSalary(workerkDTO.getSalary());
        return result;
    }
    public static CasinoBuilding CasinoBuildingFromDTO(CasinoBuildingDTO casinoBuildingDTO){
        CasinoBuilding result = new CasinoBuilding();
        result.setBuildingNumber(casinoBuildingDTO.getBuildingNumber());
        result.setAdress(casinoBuildingDTO.getAdress());
        return result;
    }
}
