package br.com.praiasol.apivagas.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Vaga {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_VAGA")
  private Long id;

  @Column(name = "NOME_VAGA")
  private String nome;

  @Column(name = "FUNCAO_VAGA")
  private String funcao;

  @Column(name = "EMPRESA_VAGA")
  private String empresa;

  @Column(name = "AREA_VAGA")
  private String area;

  @Column(name = "ESTADO_VAGA")
  private Integer estadoVaga;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "ID_TIPO_VAGA")
  private TipoVaga tipoVaga;


  public Vaga(Long id) { this.id = id; }
}
