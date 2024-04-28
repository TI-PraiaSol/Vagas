package br.com.praiasol.apivagas.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TipoVaga {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_TIPO_VAGA")
  private Long id;

  @Column(name = "NOME_TIPO_VAGA")
  private String nome;

  @Column(name = "DESC_TIPO_VAGA")
  private String descricao;
}
