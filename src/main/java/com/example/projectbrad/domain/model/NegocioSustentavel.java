package com.example.projectbrad.domain.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "negocio_sustentavel")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NegocioSustentavel {
    @Id
    @UuidGenerator
    private UUID id;

    @Column(name = "account_number", nullable = false, unique = true, length = 255)
    private String accountNumber;

    @Column(name = "account_reference")
    private String accountReference;

    @Column(name = "cdl")
    private String cdl;

    @Column(name = "segmento")
    private String segmento;

    @Column(name = "validade_inicio")
    private OffsetDateTime validadeInicio;

    @Column(name = "validade_fim")
    private OffsetDateTime validadeFim;

    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_associado_id")
    private ProdutoAssociado produtoAssociado;
}
