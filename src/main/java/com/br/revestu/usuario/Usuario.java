package com.br.revestu.usuario;
import com.br.revestu.avaliacao.Avaliacao;
import com.br.revestu.pessoa.Pessoa;
import com.br.revestu.reciclagem.Reciclagem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embedded
public class Usuario extends Pessoa {
    @Id
    private String cpf;
    private String nomeUsuario;

    @OneToMany(mappedBy = "usuario" )
    private List<Avaliacao> avaliacao;

    @ManyToMany(mappedBy = "usuario" )
    private List<Reciclagem> reciclagem;
}
