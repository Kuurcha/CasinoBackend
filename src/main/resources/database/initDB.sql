--DROP TABLE IF EXISTS companies;
CREATE TABLE IF NOT EXISTS companies
(
    companyId INTEGER PRIMARY KEY ,
    companyName VARCHAR(100) NOT NULL ,
    CEO VARCHAR(100) NOT NULL,
    sharePrice real NOT NULL
);
--DROP TABLE IF EXISTS casinoList;
CREATE TABLE IF NOT EXISTS casinoList
(
    casinoId INTEGER PRIMARY KEY ,
    adress VARCHAR(250) NOT NULL ,
    casinoNumber integer NOT NULL
);
--DROP TABLE IF EXISTS slotMachines;
CREATE TABLE IF NOT EXISTS slotMachines
(
    slotId INTEGER PRIMARY KEY,
    slotNumber INTEGER NOT NULL ,
    game VARCHAR(100) NOT NULL,
    paymentDispersion real NOT NULL,
    cashRemains real not null
);
--DROP TABLE IF EXISTS workers;
CREATE TABLE IF NOT EXISTS workers
(
    workerId INTEGER PRIMARY KEY,
    occupation VARCHAR(100) NOT NULL ,
    fullName VARCHAR(250) NOT NULL,
    salary real NOT NULL,
    dateOfBirth DATE not null
);


