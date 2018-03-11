package com.marinadamnjanovic.dao.impl;

import com.marinadamnjanovic.dao.AbstractDAO;
import com.marinadamnjanovic.dao.OdmorDAO;
import com.marinadamnjanovic.dao.ZahtevDAO;
import com.marinadamnjanovic.model.Odmor;
import com.marinadamnjanovic.model.Zahtev;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("zahtevDAO")
public class ZahtevDAOImpl extends AbstractDAO<Integer, Zahtev> implements ZahtevDAO {

    public void addZahtev(Zahtev zahtev){
        persist(zahtev);
    }

    @SuppressWarnings("unchecked")
    public List<Zahtev> listZahtev(){
        Criteria criteria = createEntityCriteria();
        return (List<Zahtev>) criteria.list();
    }

    public Zahtev getZahtevById(int zaposleniId){
        return getByKey(zaposleniId);
    }

    public void removeZahtev(int id){
        Query query = getSession().createSQLQuery("delete from zahtev where id = :id");
        query.setString("id", Integer.valueOf(id).toString());
        query.executeUpdate();
    }

}
