package seek.com.retocodigo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seek.com.retocodigo.domain.Candidates;
import seek.com.retocodigo.service.CandidatesSevice;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private static final Logger logger = LoggerFactory.getLogger(CandidateController.class);
    @Autowired
    private CandidatesSevice candidatesSevice;


    @GetMapping("/candidates")
    public List<Candidates> getCandidates(){
        List<Candidates> candidates =   candidatesSevice.listCandidates();
        return candidates;
    }
}
