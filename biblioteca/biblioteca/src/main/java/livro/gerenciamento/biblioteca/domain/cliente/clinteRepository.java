package livro.gerenciamento.biblioteca.domain.cliente;

import io.micrometer.observation.ObservationFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clinteRepository extends JpaRepository<cliente, Long> {
    Page<cliente>findAllByAtivoTrue(Pageable paginacao);
}
