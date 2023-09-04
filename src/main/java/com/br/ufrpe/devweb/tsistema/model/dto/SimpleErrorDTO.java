package com.br.ufrpe.devweb.tsistema.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SimpleErrorDTO {   

    private LocalDateTime timeStamp;

    private Integer status;

    private String error;

    private String path;
}
