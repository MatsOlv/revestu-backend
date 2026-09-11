package com.br.revestu.models;
import jakarta.persistence.Embeddable;

@Embeddable
public class Contato {
    private String email;
    private String telefone;

}
