package com.example.oficinamecanicajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oficinamecanicajpa.domain.OrdemServico;


@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer>{

}