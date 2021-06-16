package com.HrmsProjesi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
@Table(name="candidates")
public class Candidate{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @NotEmpty
    @Column(name="first_name")
    private String firstName;

    @NotBlank
    @NotEmpty
    @Column(name="last_name")
    private String lastName;

    @NotBlank
    @NotEmpty
    @Column(name="identification_number",unique = true)
    private String identificationNumber;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name="birth_year")
    private LocalDate birthYear;

    @Column(name="email",unique = true)
    @NotBlank
    @NotEmpty
    @Email
    private String email;

    @Column(name="password")
    @NotBlank
    @NotEmpty
    private String password;

    @Column(name="is_verified_by_email")
    private boolean isVerifiedByEmail;

    @OneToOne(mappedBy = "candidate",fetch = FetchType.LAZY,targetEntity = Cv.class)
    private Cv cv;

}