package com.br.ufrpe.devweb.tsistema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.ufrpe.devweb.tsistema.exception.CallNotFoundException;
import com.br.ufrpe.devweb.tsistema.model.Call;
import com.br.ufrpe.devweb.tsistema.repository.CallRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CallService {
  
  public final CallRepository chamadoRepository;
  
  public Call save(Call chamado) {
    return chamadoRepository.save(chamado);
  }

  public List<Call> findAll() {
    return chamadoRepository.findAll();
  }
  
  public Call findOne(Long id) {
    Call chamado = chamadoRepository.getOne(id);
    if (chamado == null) throw new CallNotFoundException(id);

    return chamado;
  }

  public Call update(Call chamadoUpdated) {
    Call chamado = chamadoRepository.getOne(chamadoUpdated.getProcesso_numero());

    if (chamado == null) {

      throw new CallNotFoundException(chamadoUpdated.getProcesso_numero());

    }else {

      chamado.setLatitude(chamadoUpdated.getLatitude());
      chamado.setLongitude(chamadoUpdated.getLongitude());
    }

    return chamadoRepository.save(chamado);
  }
  
}
