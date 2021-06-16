package com.HrmsProjesi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate"})

public class Cv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String photoUrl;

    private String githubUrl;

    private String linkedInUrl;

    private String description;

    private String softwareSkill;


    //@OneToMany(mappedBy = "cv")
    @OneToMany
    private List<CandidateExperience> experiences;
   // @OneToMany(mappedBy = "cv")
    @OneToMany
    private List<Language> languages;
    @OneToMany
   // @OneToMany(mappedBy = "cv")
    private List<School> school;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = Candidate.class)
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;




}
