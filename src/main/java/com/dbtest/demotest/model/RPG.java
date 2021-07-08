package com.dbtest.demotest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "rpglist1")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RPG {
    @Id
    @Column(name="id")
    @SequenceGenerator(name = "rpgIdSeq", sequenceName = "rpg_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rpgIdSeq")
    private Integer id;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void settitle(String title) {
        this.title = title;
    }
    public String gettitle() {
        return title;
    }
}
