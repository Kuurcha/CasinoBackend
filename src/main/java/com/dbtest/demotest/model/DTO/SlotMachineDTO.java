package com.dbtest.demotest.model.DTO;

import javax.persistence.Column;

public class SlotMachineDTO{



        private Integer slotNumber;


        private String gameName;


        private double paymentDispersion;


        private double cashRemains;

        private Integer fk_casino_id;

        @Override
        public String toString() {
                return String.format(
                        "Slot number " + slotNumber.toString() + System.lineSeparator() +
                        gameName + System.lineSeparator()  +
                        "Payment dispersion" + System.lineSeparator() +
                        "Cash remains : " + cashRemains + System.lineSeparator()  +
                        "fk_casino_id: " + fk_casino_id

                );
        }
        public Integer getSlotNumber() {
                return slotNumber;
        }

        public void setSlotNumber(Integer slotNumber) {
                this.slotNumber = slotNumber;
        }

        public String getGameName() {
                return gameName;
        }

        public void setGameName(String gameName) {
                this.gameName = gameName;
        }

        public double getPaymentDispersion() {
                return paymentDispersion;
        }

        public void setPaymentDispersion(double paymentDispersion) {
                this.paymentDispersion = paymentDispersion;
        }

        public double getCashRemains() {
                return cashRemains;
        }

        public void setCashRemains(double cashRemains) {
                this.cashRemains = cashRemains;
        }


        public Integer getfk_casino_id() {
                return fk_casino_id;
        }

        public void setfk_casino_id(Integer fk_casino_id) {
                this.fk_casino_id = fk_casino_id;
        }
}
