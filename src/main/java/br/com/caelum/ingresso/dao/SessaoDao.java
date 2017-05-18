package br.com.caelum.ingresso.dao;

<<<<<<< HEAD
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
=======
//import br.com.caelum.ingresso.model.Sala;
//import br.com.caelum.ingresso.model.Sessao;
>>>>>>> 253d8b113756222c18416c1e38953186c89eecf8
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by nando on 03/03/17.
 */
@Repository
public class SessaoDao {

    @PersistenceContext
    private EntityManager manager;


    public void save(Sessao sessao) {
        manager.persist(sessao);
    }

    public List<Sessao> buscaSessoesDaSala(Sala sala) {
        return manager.createQuery("select s from Sessao s where s.sala = :sala", Sessao.class)
                .setParameter("sala", sala)
                .getResultList();
    }
    
    public List<Sessao> buscaSessoesDoFilme(Filme filme) {
        return manager.createQuery("select s from Sessao s where s.filme = :filme", Sessao.class)
                .setParameter("filme", filme)
                .getResultList();
    }

}
