package com.br.revestu.reciclagem;
import com.br.revestu.produto.Produto;
import com.br.revestu.usuario.Usuario;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.UUID;

public class Reciclagem {
    @Id
    private UUID id;
    private String tipoMaterial;
    private LocalDateTime data;
    private String PontoColeta;

    @ManyToMany
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

    @ManyToMany
    @JoinColumn(name = "id_produto")
    private Produto produto;

}
