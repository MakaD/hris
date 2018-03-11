package com.marinadamnjanovic.dao.impl;

import com.marinadamnjanovic.dao.AbstractDAO;
import com.marinadamnjanovic.dao.LicniPodaciDAO;
import com.marinadamnjanovic.model.LicniPodaci;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("licniPodaciDAO")
public class LicniPodaciDAOImpl extends AbstractDAO<Integer, LicniPodaci> implements LicniPodaciDAO{

    public void addLicniPodaci(LicniPodaci licniPodaci){
        persist(licniPodaci);
    }

    @SuppressWarnings("unchecked")
    public List<LicniPodaci> listLicniPodaci(){
        Criteria criteria = createEntityCriteria();
        return (List<LicniPodaci>) criteria.list();
    }

    public LicniPodaci getLicniPodaciById(int zaposleniId){
        return getByKey(zaposleniId);
    }

    public void removeLicniPodaci(int id){
        Query query = getSession().createSQLQuery("delete from licnipodaci where id = :id");
        query.setString("id", Integer.valueOf(id).toString());
        query.executeUpdate();
    }

}
