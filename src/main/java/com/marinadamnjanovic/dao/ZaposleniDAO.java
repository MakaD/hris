package com.marinadamnjanovic.dao;

import com.marinadamnjanovic.model.Zaposleni;

import java.util.List;

public interface ZaposleniDAO {

    void addZaposleni(Zaposleni zaposleni);
    List<Zaposleni> listZaposleni();
    Zaposleni getZaposleniById(int zaposleniId);
    void removeZaposleni(int id);

}
