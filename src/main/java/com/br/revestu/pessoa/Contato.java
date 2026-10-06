package com.br.revestu.pessoa;
import jakarta.persistence.Embeddable;

@Embeddable
public class Contato {
    private String email;
    private String telefone;

}
