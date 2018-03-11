package com.marinadamnjanovic.service.impl;

import com.marinadamnjanovic.dao.LicniPodaciDAO;
import com.marinadamnjanovic.model.LicniPodaci;
import com.marinadamnjanovic.service.LicniPodaciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("licniPodaciService")
@Transactional
public class LicniPodaciServiceImpl implements LicniPodaciService{

    @Autowired
    private LicniPodaciDAO licniPodaciDAO;

    public void addLicniPodaci(LicniPodaci licniPodaci){
        licniPodaciDAO.addLicniPodaci(licniPodaci);
    }

    public void updateLicniPodaci(LicniPodaci licniPodaci){
        LicniPodaci entity = licniPodaciDAO.getLicniPodaciById(licniPodaci.getId());
        if(entity!=null){
            entity.setAdresa(licniPodaci.getAdresa());
            entity.setBracnoStanje(licniPodaci.getBracnoStanje());
            entity.setDatumRođenja(licniPodaci.getDatumRođenja());
            entity.setEmail(licniPodaci.getEmail());
            entity.setIme(licniPodaci.getIme());
            entity.setLk(licniPodaci.getLk());
            entity.setOpstina(licniPodaci.getOpstina());
            entity.setPrezime(licniPodaci.getPrezime());
            entity.setTelefon(licniPodaci.getTelefon());
            entity.setZanimanje(licniPodaci.getZanimanje());

        }
    }

    public List<LicniPodaci> listLicniPodaci(){
        return licniPodaciDAO.listLicniPodaci();
    }

    public LicniPodaci getLicniPodaciById(int zaposleniId){
        return licniPodaciDAO.getLicniPodaciById(zaposleniId);
    }

    public void removeLicniPodaci(int id){
        licniPodaciDAO.removeLicniPodaci(id);
    }

}
