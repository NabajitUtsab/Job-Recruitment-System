package com.example.Job.Recruitment.System.candidate.entity;

import com.example.Job.Recruitment.System.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "candidates")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false,unique = true)
    private User user;

    private String address;

    private String headline;

    @Column(length = 2000)
    private String summary;

    private String profilePicture;

    private LocalDate dateOfBirth;

    private String linkedInUrl;

    private String githubUrl;
}
