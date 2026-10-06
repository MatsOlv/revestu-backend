package com.br.revestu.reciclagem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ReciclagemRepository extends JpaRepository<Reciclagem, UUID> {
}
