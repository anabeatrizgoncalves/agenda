package github.anabeatriz.agenda.model.repository;


import github.anabeatriz.agenda.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
