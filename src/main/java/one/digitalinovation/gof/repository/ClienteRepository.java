package one.digitalinovation.gof.repository;

import one.digitalinovation.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
