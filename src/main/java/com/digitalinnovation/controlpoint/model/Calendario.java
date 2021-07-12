package com.digitalinnovation.controlpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {

    @Id
    private Long id;

    @ManyToOne
    private TipoData tipoData;

    private String descricao;

    private LocalDateTime dataEspecial;
}
