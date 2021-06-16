package com.HrmsProjesi.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CandidateExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyName;

    private String jobPosition;

    private String startWork;

    private String endWork;

    //@ManyToOne
   // @JoinColumn(name = "cv_id")
    //private Cv cv;
}
