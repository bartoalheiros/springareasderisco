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
  
  public final CallRepository callRepository;
  
  public Call save(Call call) {
    return callRepository.save(call);
  }

  public List<Call> findAll() {
    return callRepository.findAll();
  }
  
  public Call findOne(Long id) {
    Call call = callRepository.getOne(id);
    if (call == null) throw new CallNotFoundException(id);

    return call;
  }

  public Call update(Call callUpdated) {
    Call call = callRepository.getOne(callUpdated.getProcesso_numero());

    if (call == null) {

      throw new CallNotFoundException(callUpdated.getProcesso_numero());

    }else {

      call.setLatitude(callUpdated.getLatitude());
      call.setLongitude(callUpdated.getLongitude());
    }

    return callRepository.save(call);
  }
  
}
