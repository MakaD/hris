package com.marinadamnjanovic.service;

import com.marinadamnjanovic.model.Zahtev;

import java.util.List;

public interface ZahtevService {

    void addZahtev(Zahtev zahtev);
    void updateZahtev(Zahtev zahtev);
    List<Zahtev> listZahtev();
    Zahtev getZahtevById(int zaposleniId);
    void removeZahtev(int id);

}
