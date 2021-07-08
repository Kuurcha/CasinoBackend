DROP TABLE IF EXISTS rpglist1;
CREATE TABLE IF NOT EXISTS rpglist1
(
    id INTEGER PRIMARY KEY ,
   -- name  VARCHAR(251) NOT NULL ,
    author VARCHAR(251) NOT NULL,
    title VARCHAR(200) NOT NULL
);
DROP SEQUENCE IF EXISTS rpg_id_seq;
CREATE SEQUENCE IF NOT EXISTS rpg_id_seq START WITH 3 INCREMENT BY 1;