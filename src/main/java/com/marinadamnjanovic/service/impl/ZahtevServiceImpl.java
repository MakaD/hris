package com.marinadamnjanovic.service.impl;


import com.marinadamnjanovic.dao.ZahtevDAO;
import com.marinadamnjanovic.model.Zahtev;
import com.marinadamnjanovic.service.ZahtevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("zahtevService")
@Transactional
public class ZahtevServiceImpl implements ZahtevService{

    @Autowired
    private ZahtevDAO zahtevDAO;

    public void addZahtev(Zahtev zahtev){
        zahtevDAO.addZahtev(zahtev);
    }

    public void updateZahtev(Zahtev zahtev){
        Zahtev entity = zahtevDAO.getZahtevById(zahtev.getId());
        if(entity!=null){
            entity.setDatum(zahtev.getDatum());
            entity.setPredmet(zahtev.getPredmet());
            entity.setStatus(zahtev.getStatus());
        }
    }

    public List<Zahtev> listZahtev(){
        return zahtevDAO.listZahtev();
    }

    public Zahtev getZahtevById(int zaposleniId){
        return zahtevDAO.getZahtevById(zaposleniId);
    }

    public void removeZahtev(int id){
        zahtevDAO.removeZahtev(id);
    }

}
