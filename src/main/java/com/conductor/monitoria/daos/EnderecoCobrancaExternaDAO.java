package com.conductor.monitoria.daos;

import com.conductor.monitoria.models.EnderecoCobrancaExterna;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Classe de persistencia do EnderecoCobrancaExterna
 *
 * @author Diego Rangel
 */
@Repository
@Transactional
public class EnderecoCobrancaExternaDAO {

    @PersistenceContext
    private EntityManager manager;

    public void gravar(EnderecoCobrancaExterna enderecoCobrancaExterna){
        manager.persist(enderecoCobrancaExterna);
    }

    public List<EnderecoCobrancaExterna> listar(){
        return manager.createQuery("select p from EnderecoCobrancaExterna p").getResultList();
    }

    public EnderecoCobrancaExterna find(long id){
        return manager.createQuery("select e from EnderecoCobrancaExterna e where e.id = :id", EnderecoCobrancaExterna.class).setParameter("id", id).getSingleResult();
    }
}
