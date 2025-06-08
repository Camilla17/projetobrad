package com.example.projectbrad.domain.model;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "agrupamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agrupamento {
	
    @Id
    @UuidGenerator
    private UUID id;

    @Column(name = "account_style", nullable = false, unique = true, length = 255)
    private String accountStyle;

    @Column(name = "account_style_accrue_type")
    private String accountStyleAccrueType;

    @Column(name = "account_style_consumption_accrue_method")
    private String accountStyleConsumptionAccrueMethod;

    @Column(name = "account_style_cost_accrue_method")
    private String accountStyleCostAccrueMethod;
}