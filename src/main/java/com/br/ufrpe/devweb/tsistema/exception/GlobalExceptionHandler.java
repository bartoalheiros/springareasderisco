package com.br.ufrpe.devweb.tsistema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CallNotFoundException.class)
    public ResponseEntity<String> handleCallNotFoundException(CallNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    // Outros métodos @ExceptionHandler para tratar exceções específicas
}
