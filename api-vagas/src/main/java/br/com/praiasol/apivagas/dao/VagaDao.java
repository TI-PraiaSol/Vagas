package br.com.praiasol.apivagas.dao;

import br.com.praiasol.apivagas.model.Vaga;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class VagaDao {

  @PersistenceContext
  private EntityManager manager;

  @Transactional
  public Vaga persistirVaga(Vaga vaga) {
    manager.persist(vaga);
    return vaga;
  }

  @Transactional
  public Vaga atualizarVaga(Vaga vaga) {
    manager.merge(vaga);
    return vaga;
  }

  @Transactional
  public boolean excluirVaga(Vaga vaga) {
    manager.remove(vaga);
    return true;
  }

}
