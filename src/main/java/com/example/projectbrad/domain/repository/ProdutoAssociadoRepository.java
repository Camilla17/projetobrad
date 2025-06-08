package com.example.projectbrad.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbrad.domain.model.ProdutoAssociado;

public interface ProdutoAssociadoRepository extends JpaRepository<ProdutoAssociado, UUID>{

}
