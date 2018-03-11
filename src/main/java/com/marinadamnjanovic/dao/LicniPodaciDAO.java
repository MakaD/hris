package com.marinadamnjanovic.dao;

import com.marinadamnjanovic.model.LicniPodaci;

import java.util.List;

public interface LicniPodaciDAO {

    void addLicniPodaci(LicniPodaci licniPodaci);
    List<LicniPodaci> listLicniPodaci();
    LicniPodaci getLicniPodaciById(int zaposleniId);
    void removeLicniPodaci(int id);

}
