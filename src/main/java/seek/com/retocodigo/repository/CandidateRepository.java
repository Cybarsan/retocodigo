package seek.com.retocodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seek.com.retocodigo.domain.Candidates;

public interface CandidateRepository extends JpaRepository<Candidates, Long> {

}
