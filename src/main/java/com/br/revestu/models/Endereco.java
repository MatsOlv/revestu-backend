package com.br.revestu.models;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String cep;
    private String numeroCasa;
}
