package com.marinadamnjanovic.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name="zahtev")
public class Zahtev {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_zahtev")
    private int id;

    @NotEmpty
    private int status;

    @NotEmpty
    private String predmet;

    @NotEmpty
    private int datum;

    @Column(name = "id_zaposleni")
    private int idZaposleni;

    public Zahtev() {
    }

    public Zahtev(int status, String predmet, int datum, int idZaposleni) {
        this.status = status;
        this.predmet = predmet;
        this.datum = datum;
        this.idZaposleni = idZaposleni;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getDatum() {
        return datum;
    }

    public void setDatum(int datum) {
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdZaposleni() {
        return idZaposleni;
    }

    public void setIdZaposleni(int idZaposleni) {
        this.idZaposleni = idZaposleni;
    }
}
