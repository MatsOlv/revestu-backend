package com.br.revestu.avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, UUID> {
}
