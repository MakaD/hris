package com.marinadamnjanovic.dao;

import com.marinadamnjanovic.model.Odmor;

import java.util.List;

public interface OdmorDAO {

    void addOdmor(Odmor odmor);
    List<Odmor> listOdmor();
    Odmor getOdmorById(int zahtevId);
    void removeOdmor(int id);

}
