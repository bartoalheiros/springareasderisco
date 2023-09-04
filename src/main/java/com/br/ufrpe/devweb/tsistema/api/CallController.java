package com.br.ufrpe.devweb.tsistema.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ufrpe.devweb.tsistema.exception.CallNotFoundException;
import com.br.ufrpe.devweb.tsistema.model.Call;
import com.br.ufrpe.devweb.tsistema.service.CallService;

@CrossOrigin
@RestController
@RequestMapping("/call")
public class CallController {
  
  @Autowired
  public CallService callService;

  @PostMapping(path = "/add")
  public Call save(@RequestBody Call customer) {
    return callService.save(customer);
  }
  
  @GetMapping(path = "/get/{id}")
  public ResponseEntity<?> getCallById(@PathVariable("id") final Long id) {
    return ResponseEntity.ok(callService.getCallById(id));
  }
  
  @PostMapping(path = "/update")
  public Call update(@RequestBody Call call) {
    return callService.update(call);
  }
}
