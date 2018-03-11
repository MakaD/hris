package com.marinadamnjanovic.dao.impl;

import com.marinadamnjanovic.dao.AbstractDAO;
import com.marinadamnjanovic.dao.ZaposleniDAO;
import com.marinadamnjanovic.model.Zahtev;
import com.marinadamnjanovic.model.Zaposleni;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("zaposleniDAO")
public class ZaposleniDAOImpl extends AbstractDAO<Integer, Zaposleni> implements ZaposleniDAO {

    public void addZaposleni(Zaposleni zaposleni){
        persist(zaposleni);
    }

    @SuppressWarnings("unchecked")
    public List<Zaposleni> listZaposleni(){
        Criteria criteria = createEntityCriteria();
        return (List<Zaposleni>) criteria.list();
    }

    public Zaposleni getZaposleniById(int zaposleniId){
        return getByKey(zaposleniId);
    }

    public void removeZaposleni(int id){
        Query query = getSession().createSQLQuery("delete from zaposleni where id = :id");
        query.setString("id", Integer.valueOf(id).toString());
        query.executeUpdate();
    }

}
