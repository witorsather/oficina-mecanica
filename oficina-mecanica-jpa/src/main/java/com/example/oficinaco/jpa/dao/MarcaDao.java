package com.example.oficinaco.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.oficinaco.jpa.entidade.Marca;

@Repository
public interface MarcaDao extends JpaRepository<Marca, Integer>{


    @Query(nativeQuery = true, value = "select * from marca m where lower(m.nome) like lower(:nome)")
	List<Marca> listarPorNome(@Param("nome") String nome);




}
