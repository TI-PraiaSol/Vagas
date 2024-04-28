package br.com.praiasol.apivagas.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class RequisitoVaga {

  @EmbeddedId
  private RequisitoVagaID id;


  public RequisitoVaga(Requisito requisito, Vaga vaga) {
    this.id = new RequisitoVagaID();
    this.id.setIdRequisito(requisito.getId());
    this.id.setIdVaga(vaga.getId());
  }

  public RequisitoVaga(Long requisito, Long vaga) {
    this.id = new RequisitoVagaID();
    this.id.setIdRequisito(requisito);
    this.id.setIdVaga(vaga);
  }

  public RequisitoVaga(RequisitoVagaID requisito) {
    this.id = new RequisitoVagaID();
    this.id.setIdRequisito(requisito.getIdRequisito());
    this.id.setIdVaga(requisito.getIdVaga());
  }

  public RequisitoVaga() {

  }
}
