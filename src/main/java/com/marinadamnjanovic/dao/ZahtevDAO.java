package com.marinadamnjanovic.dao;

import com.marinadamnjanovic.model.Zahtev;

import java.util.List;

public interface ZahtevDAO {

    void addZahtev(Zahtev zahtev);
    List<Zahtev> listZahtev();
    Zahtev getZahtevById(int zaposleniId);
    void removeZahtev(int id);

}
