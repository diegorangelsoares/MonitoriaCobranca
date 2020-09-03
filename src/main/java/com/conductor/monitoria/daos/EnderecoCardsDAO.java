package com.conductor.monitoria.daos;

import com.conductor.monitoria.models.EnderecoCards;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Classe de persistencia do EnderecoCards
 *
 * @author Diego Rangel
 */
@Repository
@Transactional
public class EnderecoCardsDAO {

    @PersistenceContext
    private EntityManager manager;

    public void gravar(EnderecoCards enderecoCards){
        manager.persist(enderecoCards);
    }

    public List<EnderecoCards> listar(){
        return manager.createQuery("select p from EnderecoCards p").getResultList();
    }

    public EnderecoCards find(long id){
        return manager.createQuery("select e from EnderecoCards e where e.id = :id", EnderecoCards.class).setParameter("id", id).getSingleResult();
    }

}
