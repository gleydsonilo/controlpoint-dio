package com.digitalinnovation.controlpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {

    @Id
    private Long id;

    private String nome;

    private String descricao;

}
