package com.br.revestu.pessoa;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    @Id
    private String idPessoa ;
    private String nome ;
    @Embedded
    private Endereco endereco;
    @Embedded
    private Contato contato;

}
