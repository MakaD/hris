package com.marinadamnjanovic.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="odmor")
public class Odmor extends Zahtev {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_odmor")
    private int id;

    @NotEmpty
    @Column(name = "datumOd")
    private Date datumOd;

    @NotEmpty
    @Column(name = "datumDo")
    private Date datumDo;

    @NotEmpty
    @Column(name = "povod")
    private String povod;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_zahtev")
    private Zahtev idZahtev;

    public Odmor() {
    }

    public Odmor(Date datumOd, Date datumDo, String povod, Zahtev idZahtev) {
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.povod = povod;
        this.idZahtev = idZahtev;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public String getPovod() {
        return povod;
    }

    public void setPovod(String povod) {
        this.povod = povod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Zahtev getIdZahtev() {
        return idZahtev;
    }

    public void setIdZahtev(Zahtev idZahtev) {
        this.idZahtev = idZahtev;
    }

}
