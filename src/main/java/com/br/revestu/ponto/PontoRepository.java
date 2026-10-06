package com.br.revestu.ponto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PontoRepository extends JpaRepository<Ponto, UUID> {
}
