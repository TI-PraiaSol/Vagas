package br.com.praiasol.apivagas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class RequisitoVagaID implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "ID_VAGA")
  private Long idVaga;

  @Column(name = "ID_REQUISITO")
  private Long idRequisito;
}
