package com.br.ufrpe.devweb.tsistema.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ufrpe.devweb.tsistema.model.Chamado;
import com.br.ufrpe.devweb.tsistema.service.ChamadoService;

@CrossOrigin
@RestController
@RequestMapping("/chamados")
public class ChamadoController {
  
  @Autowired
  public ChamadoService chamadoService;

  @PostMapping(path = "/add")
  public Chamado save(@RequestBody Chamado customer) {
    return chamadoService.save(customer);
  }
  
  @GetMapping(path = "/get/{id}")
  public Chamado get(@PathVariable("id") Long id) {
    return chamadoService.findOne(id);
  }
  
  @PostMapping(path = "/update")
  public Chamado update(@RequestBody Chamado chamado) {
    return chamadoService.update(chamado);
  }
}
