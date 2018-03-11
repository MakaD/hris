package com.marinadamnjanovic.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="zaposleni")
public class Zaposleni {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_zaposleni")
    private int id;

    private String username;

    private String password;

    @NotEmpty
    private int rola;

    public java.util.Collection<Zahtev> zahtev;

    public Zaposleni(int id, String username, String password, int rola, Collection<Zahtev> zahtev) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rola = rola;
        this.zahtev = zahtev;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRola() {
        return rola;
    }

    public void setRola(int rola) {
        this.rola = rola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Zaposleni() {

    }

    public java.util.Collection<Zahtev> getZahtev() {
        if (zahtev == null)
            zahtev = new java.util.HashSet<Zahtev>();
        return zahtev;
    }

    public java.util.Iterator getIteratorZahtev() {
        if (zahtev == null)
            zahtev = new java.util.HashSet<Zahtev>();
        return zahtev.iterator();
    }


    public void setZahtev(java.util.Collection<Zahtev> newZahtev) {
        removeAllZahtev();
        for (java.util.Iterator iter = newZahtev.iterator(); iter.hasNext();)
            addZahtev((Zahtev)iter.next());
    }


    public void addZahtev(Zahtev newZahtev) {
        if (newZahtev == null)
            return;
        if (this.zahtev == null)
            this.zahtev = new java.util.HashSet<Zahtev>();
        if (!this.zahtev.contains(newZahtev))
            this.zahtev.add(newZahtev);
    }


    public void removeZahtev(Zahtev oldZahtev) {
        if (oldZahtev == null)
            return;
        if (this.zahtev != null)
            if (this.zahtev.contains(oldZahtev))
                this.zahtev.remove(oldZahtev);
    }

    public void removeAllZahtev() {
        if (zahtev != null)
            zahtev.clear();
    }

}
