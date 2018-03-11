package com.marinadamnjanovic.service.impl;

import com.marinadamnjanovic.dao.ZaposleniDAO;
import com.marinadamnjanovic.model.Zaposleni;
import com.marinadamnjanovic.service.ZaposleniService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ZaposleniServiceImpl implements ZaposleniService{

    @Autowired
    private ZaposleniDAO zaposleniDAO;

    public void addZaposleni(Zaposleni zaposleni){
        zaposleniDAO.addZaposleni(zaposleni);
    }

    public void updateZaposleni(Zaposleni zaposleni){
        Zaposleni entity = zaposleniDAO.getZaposleniById(zaposleni.getId());
        if(entity!=null){

        }
    }

    public List<Zaposleni> listZaposleni(){
        return zaposleniDAO.listZaposleni();
    }

    public Zaposleni getZaposleniById(int zaposleniId){
        return zaposleniDAO.getZaposleniById(zaposleniId);
    }

    public void removeZaposleni(int id){
        zaposleniDAO.removeZaposleni(id);
    }

}
