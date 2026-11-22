package com.example.Job.Recruitment.System.candidate.repository;

import com.example.Job.Recruitment.System.candidate.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Long> {

    Optional<Candidate> findByUserId(Long id);
    boolean existsByUserId(Long id);

}
