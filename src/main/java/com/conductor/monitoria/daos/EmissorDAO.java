package com.conductor.monitoria.daos;

import com.conductor.monitoria.models.Emissor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Classe de persistencia do Emissor
 *
 * @author Diego Rangel
 */
@Repository
@Transactional
public class EmissorDAO {

    @PersistenceContext
    private EntityManager manager;

    public void gravar(Emissor emissor){
        manager.persist(emissor);
    }

    public List<Emissor> listar(){
        return manager.createQuery("select p from Emissor p").getResultList();
    }

    public Emissor find(long id){
        return manager.createQuery("select e from Emissor e where e.id = :id", Emissor.class).setParameter("id", id).getSingleResult();
    }

}
