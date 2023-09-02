package com.br.ufrpe.devweb.tsistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ufrpe.devweb.tsistema.model.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long>{

}
