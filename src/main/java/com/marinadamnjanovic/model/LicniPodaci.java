package com.marinadamnjanovic.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name="licnipodaci")
public class LicniPodaci {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_licnipod")
    private int id;

    @NotEmpty
    private String ime;

    @NotEmpty
    private String prezime;

    private Date datumRođenja;

    private long lk;

    private String email;

    private long telefon;

    private String adresa;

    private int opstina;

    private int bracnoStanje;

    private String zanimanje;

    @Column(name = "id_zaposleni")
    private String idZaposleni;

    public java.util.Collection<Zaposleni> zaposleni;

    public LicniPodaci(String ime, String prezime, Date datumRođenja, long lk, String email, long telefon, String adresa, int opstina, int bracnoStanje, String zanimanje, String idZaposleni, Collection<Zaposleni> zaposleni) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRođenja = datumRođenja;
        this.lk = lk;
        this.email = email;
        this.telefon = telefon;
        this.adresa = adresa;
        this.opstina = opstina;
        this.bracnoStanje = bracnoStanje;
        this.zanimanje = zanimanje;
        this.idZaposleni = idZaposleni;
        this.zaposleni = zaposleni;
    }

    public LicniPodaci() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRođenja() {
        return datumRođenja;
    }

    public void setDatumRođenja(Date datumRođenja) {
        this.datumRođenja = datumRođenja;
    }

    public long getLk() {
        return lk;
    }

    public void setLk(long lk) {
        this.lk = lk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getOpstina() {
        return opstina;
    }

    public void setOpstina(int opstina) {
        this.opstina = opstina;
    }

    public int getBracnoStanje() {
        return bracnoStanje;
    }

    public void setBracnoStanje(int bracnoStanje) {
        this.bracnoStanje = bracnoStanje;
    }

    public String getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(String zanimanje) {
        this.zanimanje = zanimanje;
    }

    public String getIdZaposleni() {
        return idZaposleni;
    }

    public void setIdZaposleni(String idZaposleni) {
        this.idZaposleni = idZaposleni;
    }
}
