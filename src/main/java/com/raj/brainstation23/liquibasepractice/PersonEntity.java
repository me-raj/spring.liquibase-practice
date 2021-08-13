package com.raj.brainstation23.liquibasepractice;

import javax.persistence.*;


@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "favouritefood")
    private String favouritefood;

    @Column(name = "address")
    private String address;

    @Column()
    private String favouriteperson;

    public PersonEntity(String name, String favouritefood, String address) {
        this.name = name;
        this.favouritefood = favouritefood;
        this.address = address;
//        this.favouriteperson = favouriteperson;
    }

    public PersonEntity(String name, String favouriteFood) {
        this.name = name;
        this.favouritefood = favouriteFood;

    }

    public PersonEntity() {
        //for db persistance
    }

    public String getFavouriteperson() {
        return favouriteperson;
    }

    public void setFavouriteperson(String favouriteperson) {
        this.favouriteperson = favouriteperson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
