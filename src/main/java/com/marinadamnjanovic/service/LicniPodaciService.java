package com.marinadamnjanovic.service;

import com.marinadamnjanovic.model.LicniPodaci;

import java.util.List;

public interface LicniPodaciService {

    void addLicniPodaci(LicniPodaci licniPodaci);
    void updateLicniPodaci(LicniPodaci licniPodaci);
    List<LicniPodaci> listLicniPodaci();
    LicniPodaci getLicniPodaciById(int zaposleniId);
    void removeLicniPodaci(int id);

}
