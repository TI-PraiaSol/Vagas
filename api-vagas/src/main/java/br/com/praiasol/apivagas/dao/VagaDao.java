package br.com.praiasol.apivagas.dao;

import br.com.praiasol.apivagas.model.Vaga;
import br.com.praiasol.apivagas.to.VagaTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.query.TypedParameterValue;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import java.util.List;

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

  public Vaga buscarVaga(Long id) throws NoResultException{
    String sql = "SELECT * FROM RHDP_vaga WHERE id_vaga = :id";
    return (Vaga) manager.createNativeQuery(sql, Vaga.class)
        .setParameter("id", new TypedParameterValue<>(StandardBasicTypes.LONG, id))
        .getSingleResult();
  }

  public List<Vaga> buscarVaga(VagaTO vaga) {
    String sql = "SELECT * \r\n"
        + "FROM  RHDP_vaga \r\n"
        + "WHERE 1 = 1 \r\n"
        + "AND (id_vaga = :id OR :id IS NULL \r\n"
        + "AND (UPPER(nome_vaga) like CONCAT('%',UPPER(:vaga),'%') OR :vaga IS NULL) \r\n"
        + "AND (UPPER(funcao_vaga) like CONCAT('%',UPPER(:funcao),'%') OR :funcao IS NULL) \r\n"
        + "AND (UPPER(empresa_vaga) like CONCAT('%',UPPER(:empresa),'%') OR :empresa IS NULL) \r\n"
        + "AND (UPPER(area_vaga) like CONCAT('%',UPPER(:area),'%') OR :area IS NULL) \r\n"

        + "AND (id_tipo_vaga = :tipoVaga OR :tipoVaga IS NULL) \r\n";

    return manager.createNativeQuery(sql, Vaga.class)
        .setParameter("id", new TypedParameterValue<>(StandardBasicTypes.LONG, vaga.getId()))
        .setParameter("vaga", new TypedParameterValue<>(StandardBasicTypes.STRING, vaga.getNome()))
        .setParameter("funcao", new TypedParameterValue<>(StandardBasicTypes.STRING, vaga.getFuncao()))
        .setParameter("empresa", new TypedParameterValue<>(StandardBasicTypes.STRING, vaga.getEmpresa()))
        .setParameter("area", new TypedParameterValue<>(StandardBasicTypes.STRING, vaga.getArea()))
        .setParameter("tipoVaga", new TypedParameterValue(StandardBasicTypes.LONG, vaga.getTipoVaga()))
        .getResultList();


  }

}
