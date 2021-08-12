package com.raj.brainstation23.liquibasepractice;

import javax.persistence.*;


@Entity
@Table(name="person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="favouritefood")
    private String favouritefood;

    public PersonEntity() {
        //for db persistance
    }

    public PersonEntity( String name, String favouriteFood) {
        this.name = name;
        this.favouritefood = favouriteFood;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouritefood() {
        return favouritefood;
    }

    public void setFavouritefood(String favouriteFood) {
        this.favouritefood = favouriteFood;
    }
}
