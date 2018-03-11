package com.marinadamnjanovic.service;

import com.marinadamnjanovic.model.Odmor;

import java.util.List;

public interface OdmorService {

    void addOdmor(Odmor odmor);
    void updateOdmor(Odmor odmor);
    List<Odmor> listOdmor();
    Odmor getOdmorById(int zahtevId);
    void removeOdmor(int id);

}
