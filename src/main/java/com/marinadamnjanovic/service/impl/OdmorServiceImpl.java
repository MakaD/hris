package com.marinadamnjanovic.service.impl;

import com.marinadamnjanovic.dao.OdmorDAO;
import com.marinadamnjanovic.model.Odmor;
import com.marinadamnjanovic.service.OdmorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("odmorService")
@Transactional
public class OdmorServiceImpl implements OdmorService{

    @Autowired
    private OdmorDAO odmorDAO;

    public void addOdmor(Odmor odmor){
        odmorDAO.addOdmor(odmor);
    }

    public void updateOdmor(Odmor odmor){
        Odmor entity = odmorDAO.getOdmorById(odmor.getId());
        if(entity!=null){
            entity.setPovod(odmor.getPovod());
            entity.setDatumOd(odmor.getDatumOd());
            entity.setDatumDo(odmor.getDatumDo());
        }
    }

    public List<Odmor> listOdmor(){
        return odmorDAO.listOdmor();
    }

    public Odmor getOdmorById(int zahtevId){
        return odmorDAO.getOdmorById(zahtevId);
    }

    public void removeOdmor(int id){
        odmorDAO.removeOdmor(id);
    }

}
