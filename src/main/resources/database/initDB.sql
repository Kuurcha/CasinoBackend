--DROP TABLE IF EXISTS companies;
CREATE TABLE IF NOT EXISTS companies
(
    companyId INTEGER PRIMARY KEY ,
    companyName VARCHAR(100) NOT NULL ,
    CEO VARCHAR(100) NOT NULL,
    sharePrice real NOT NULL
);
CREATE SEQUENCE IF NOT EXISTS companies_id_seq START WITH 1 INCREMENT BY 1;
--DROP TABLE IF EXISTS casino_list;
CREATE TABLE IF NOT EXISTS casino_list
(
    casino_id INTEGER PRIMARY KEY ,
    adress VARCHAR(250) NOT NULL ,
    casino_Number integer NOT NULL
);
--drop sequence if exists  casino_id_seq;
CREATE SEQUENCE IF NOT EXISTS casino_id_seq START WITH 1 INCREMENT BY 1;
--DROP TABLE IF EXISTS slotMachines;
CREATE TABLE IF NOT EXISTS slotMachines
(
    slotId INTEGER PRIMARY KEY,
    slotNumber INTEGER NOT NULL ,
    game VARCHAR(100) NOT NULL,
    paymentDispersion real NOT NULL,
    cashRemains real not null
);
CREATE SEQUENCE IF NOT EXISTS slotMachines_id_seq START WITH 1 INCREMENT BY 1;
--DROP TABLE IF EXISTS workers;
CREATE TABLE IF NOT EXISTS workers
(
    workerId INTEGER PRIMARY KEY,
    occupation VARCHAR(100) NOT NULL ,
    fullName VARCHAR(250) NOT NULL,
    salary real NOT NULL,
    dateOfBirth DATE not null
);
CREATE SEQUENCE IF NOT EXISTS workers_id_seq START WITH 1 INCREMENT BY 1;


