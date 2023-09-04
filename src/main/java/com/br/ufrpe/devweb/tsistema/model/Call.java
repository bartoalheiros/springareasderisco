package com.br.ufrpe.devweb.tsistema.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="tb_registro")
public class Call implements Serializable{ 
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long processo_numero;
  
  private String ano;
  
  private String mes;
 
  private Date solicitacao_data;
  
  private Time solicitacao_hora;
  
  private String solicitacao_descricao;
  
  private String solicitacao_regional;
  
  private String solicitacao_bairro;
  
  private String solicitacao_localidade;
  
  private String solicitacao_endereco;
  
  private String solicitacao_roteiro;
  
  private Integer rpa_codigo;
  
  private String rpa_nome;
  
  private String solicitacao_microrregiao;
  
  private String solicitacao_plantao;
  
  private String solicitacao_origem_chamado;
  
  private Double latitude;
  
  private Double longitude;
  
  private String solicitacao_vitimas;
  
  private String solicitacao_vitimas_fatais;
  
  private String processo_situacao;
  
  private String processo_tipo;
  
  private String processo_origem;
  
  private String processo_localizacao;
  
  private String processo_status;
  
  private String processo_data_conclusao;

}
