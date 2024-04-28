package br.com.praiasol.apivagas.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Requisito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REQUISITO")
    private Long id;

    @Column(name = "NOME_REQUISITO")
    private String nome;

    @Column(name = "DESC_REQUISITO")
    private String descricao;

}
