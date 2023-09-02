package com.br.ufrpe.devweb.tsistema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Chamado")  // 404
public class ChamadoNotFoundException extends  RuntimeException {
  
  private static final long serialVersionUID = 137744895179504666L;

  public ChamadoNotFoundException(Long id) {
  }

}
