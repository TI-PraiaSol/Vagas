package br.com.praiasol.apivagas.to;

import lombok.Data;

@Data
public class VagaTO {

  private Long id;
  private String nome;
  private String funcao;
  private String empresa;
  private String area;
  private String estado;
}