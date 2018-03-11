package com.marinadamnjanovic.dao.impl;

import com.marinadamnjanovic.dao.AbstractDAO;
import com.marinadamnjanovic.dao.OdmorDAO;
import com.marinadamnjanovic.model.Odmor;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("odmorDAO")
public class OdmorDAOImpl extends AbstractDAO<Integer, Odmor> implements OdmorDAO{

    public void addOdmor(Odmor odmor){
        persist(odmor);
    }

    @SuppressWarnings("unchecked")
    public List<Odmor> listOdmor(){
        Criteria criteria = createEntityCriteria();
        return (List<Odmor>) criteria.list();
    }

    public Odmor getOdmorById(int zahtevId){
        return getByKey(zahtevId);
    }

    public void removeOdmor(int id){
        Query query = getSession().createSQLQuery("delete from odmor where id = :id");
        query.setString("id", Integer.valueOf(id).toString());
        query.executeUpdate();
    }

}
