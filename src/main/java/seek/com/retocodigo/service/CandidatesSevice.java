package seek.com.retocodigo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seek.com.retocodigo.domain.Candidates;
import seek.com.retocodigo.repository.CandidateRepository;

import java.util.List;
@Service
public class CandidatesSevice implements ICandidatesService {
    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public List<Candidates> listCandidates(){
        return candidateRepository.findAll();
    }
}
