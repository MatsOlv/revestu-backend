package com.br.revestu.pessoa;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String cep;
    private String numeroCasa;
    private String rua;
    private String bairro;
    private String estado;
    private String pais;
}
