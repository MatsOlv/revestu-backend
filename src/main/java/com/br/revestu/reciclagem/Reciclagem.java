package com.br.revestu.reciclagem;

import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

public class Reciclagem {
    @Id
    private UUID id;
    private String tipoMaterial;
    private LocalDateTime data;
    private String PontoColeta;

}
