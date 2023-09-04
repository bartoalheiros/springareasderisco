package com.br.ufrpe.devweb.tsistema.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.br.ufrpe.devweb.tsistema.model.dto.SimpleErrorDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CallNotFoundException.class)
    public ResponseEntity<SimpleErrorDTO> handleCallNotFoundException(CallNotFoundException ex, HttpServletRequest req) {
        SimpleErrorDTO error =
                new SimpleErrorDTO(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), ex.getMessage(), req.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    // Outros métodos @ExceptionHandler para tratar exceções específicas
}
