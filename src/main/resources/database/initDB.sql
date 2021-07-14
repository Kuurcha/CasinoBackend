DROP TABLE IF EXISTS companies CASCADE;
CREATE TABLE IF NOT EXISTS companies
(
    companyId INTEGER PRIMARY KEY ,
    companyName VARCHAR(120) NOT NULL ,
    ceo VARCHAR(100) NOT NULL,
    sharePrice real NOT NULL,
    UNIQUE (companyName)
);
DROP SEQUENCE IF EXISTS companies_id_seq;
CREATE SEQUENCE IF NOT EXISTS companies_id_seq START WITH 3 INCREMENT BY 1;
DROP TABLE IF EXISTS casino_list CASCADE;;
CREATE TABLE IF NOT EXISTS casino_list
(
    casino_id INTEGER PRIMARY KEY ,
    adress VARCHAR(250) NOT NULL ,
    casino_Number integer NOT NULL,
    FK_companyID integer not null,
    foreign key (FK_companyID) references companies(companyId) ON DELETE CASCADE,
    unique (FK_companyID, casino_Number)
);
drop sequence if exists  casino_id_seq;
CREATE SEQUENCE IF NOT EXISTS casino_id_seq START WITH 4 INCREMENT BY 1;
DROP TABLE IF EXISTS slotMachines CASCADE;;
CREATE TABLE IF NOT EXISTS slotMachines
(
    slotId INTEGER PRIMARY KEY,
    slotNumber INTEGER NOT NULL ,
    game VARCHAR(100) NOT NULL,
    paymentDispersion real NOT NULL,
    cashRemains real not null,
    fk_casino_id integer not null,
    FOREIGN KEY(FK_casino_id) references casino_list(casino_id) ON DELETE CASCADE,
    unique (FK_casino_id, slotNumber)
);
drop sequence if exists  lotMachines_id_seq;
CREATE SEQUENCE IF NOT EXISTS slotMachines_id_seq START WITH 10 INCREMENT BY 1;
DROP TABLE IF EXISTS workers CASCADE;;
CREATE TABLE IF NOT EXISTS workers
(
    workerId INTEGER PRIMARY KEY,
    occupation VARCHAR(100) NOT NULL ,
    fullName VARCHAR(250) NOT NULL,
    salary real NOT NULL,
    dateOfBirth DATE not null,
    FK_casino_id integer not null,
    FOREIGN KEY(FK_casino_id) references casino_list(casino_id) ON DELETE CASCADE
);
drop sequence if exists  workers_id_seq ;
CREATE SEQUENCE IF NOT EXISTS workers_id_seq START WITH 13 INCREMENT BY 1;


