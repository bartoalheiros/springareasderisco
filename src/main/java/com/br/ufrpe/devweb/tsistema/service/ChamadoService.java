package com.br.ufrpe.devweb.tsistema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.ufrpe.devweb.tsistema.exception.ChamadoNotFoundException;
import com.br.ufrpe.devweb.tsistema.model.Chamado;
import com.br.ufrpe.devweb.tsistema.repository.ChamadoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ChamadoService {
  
  public final ChamadoRepository chamadoRepository;
  
  public Chamado save(Chamado chamado) {
    return chamadoRepository.save(chamado);
  }

  public List<Chamado> findAll() {
    return chamadoRepository.findAll();
  }
  
  public Chamado findOne(Long id) {
    Chamado chamado = chamadoRepository.getOne(id);
    if (chamado == null) throw new ChamadoNotFoundException(id);

    return chamado;
  }

  public Chamado update(Chamado chamadoUpdated) {

    Chamado chamado = chamadoRepository.getOne(chamadoUpdated.getProcesso_numero());

    if (chamado == null) {

      throw new ChamadoNotFoundException(chamadoUpdated.getProcesso_numero());

    }else {

      chamado.setLatitude(chamadoUpdated.getLatitude());
      chamado.setLongitude(chamadoUpdated.getLongitude());
    }

    return chamadoRepository.save(chamado);
  }
  
}
