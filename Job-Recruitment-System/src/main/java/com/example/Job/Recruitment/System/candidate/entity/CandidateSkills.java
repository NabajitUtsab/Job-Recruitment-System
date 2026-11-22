package com.example.Job.Recruitment.System.candidate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidates_skills",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"candidate_id","skill_id"}
                )
        }
)

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate_id",nullable = false)
    private Candidate candidate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_id",nullable = false)
    private Skills skills;
}
