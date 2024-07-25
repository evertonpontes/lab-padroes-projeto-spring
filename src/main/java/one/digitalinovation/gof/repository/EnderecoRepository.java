package one.digitalinovation.gof.repository;

import one.digitalinovation.gof.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
