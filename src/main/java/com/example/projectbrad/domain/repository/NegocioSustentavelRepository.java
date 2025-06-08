package com.example.projectbrad.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectbrad.domain.model.NegocioSustentavel;

public interface NegocioSustentavelRepository extends JpaRepository<NegocioSustentavel, UUID>{

}
