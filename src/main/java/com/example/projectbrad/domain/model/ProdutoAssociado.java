package com.example.projectbrad.domain.model;

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
@Table(name = "produto_associado")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdutoAssociado {
    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false, unique = true, length = 255)
    private String location;

    @Column(name = "location_account_ref")
    private String locationAccountRef;

    @ManyToOne(optional = false)
    @JoinColumn(name = "agrupamento_id")
    private Agrupamento agrupamento;
}
