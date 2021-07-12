package com.digitalinnovation.controlpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
