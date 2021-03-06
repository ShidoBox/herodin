package com.ey.br.herodin.models;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="tb_heroes")
@SQLDelete(sql = "UPDATE tb_heroes SET active = false WHERE id=?")
@Where(clause = "active=true")
public class Heroes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> powers = new HashSet<>();

    // Plan B
    private String powerString;


    private String universe;

    private ZonedDateTime registrationDate = ZonedDateTime.now();

    private Boolean active = Boolean.TRUE;


    /*Getters and Setters*/

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

    public Set<String> getPowers() {
        return powers;
    }

    public void setPowers(Set<String> powers) {
        this.powers = powers;
    }

    // Plan B
    public String getPowerString() {
        return powerString;
    }

    public void setPowerString(String powerString) {
        this.powerString = powerString;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public ZonedDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(ZonedDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}

