package com.marinadamnjanovic.service;

import com.marinadamnjanovic.model.Zaposleni;

import java.util.List;

public interface ZaposleniService {

    void addZaposleni(Zaposleni zaposleni);
    void updateZaposleni(Zaposleni zaposleni);
    List<Zaposleni> listZaposleni();
    Zaposleni getZaposleniById(int zaposleniId);
    void removeZaposleni(int id);

}
