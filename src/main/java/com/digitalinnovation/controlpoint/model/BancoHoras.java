package com.digitalinnovation.controlpoint.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private Long idBanco;
        private Long idMovimento;
        private Long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoHorasId bancoHorasId;

    private String categoria;

    private LocalDateTime dataTrabalhada;

    private BigDecimal horasTrabalhadas;

    private BigDecimal horasTrabalhadasSaldo;

}


