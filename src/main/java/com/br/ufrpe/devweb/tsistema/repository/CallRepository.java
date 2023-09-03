package com.br.ufrpe.devweb.tsistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ufrpe.devweb.tsistema.model.Call;

@Repository
public interface CallRepository extends JpaRepository<Call, Long>{

}
