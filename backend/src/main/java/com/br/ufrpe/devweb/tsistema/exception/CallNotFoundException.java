package com.br.ufrpe.devweb.tsistema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Call")  // 404
public class CallNotFoundException extends  RuntimeException {
  
  private static final long serialVersionUID = 137744895179504666L;
  
  final String msg;

  public CallNotFoundException(String msg) {
    this.msg = msg;
  }

  @Override
  public String getMessage() {
    return this.msg;
  }

}
