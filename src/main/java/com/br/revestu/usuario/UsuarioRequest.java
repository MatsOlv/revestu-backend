package com.br.revestu.usuario;

import com.br.revestu.pessoa.Contato;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioRequest(@NotBlank
                            @Size(min = 11, max = 11)
                             String cpf,
                             @NotBlank
                             String nome,
                             @NotBlank
                             String nomeUsuario,
                             @Email
                             String email,
                             @NotNull
                             String telefone,
                             @NotBlank
                             String cep,
                             @NotNull
                             String numeroCasa
                             ) {


}
