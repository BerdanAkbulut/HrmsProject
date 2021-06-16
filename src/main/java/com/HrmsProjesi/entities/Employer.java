package com.HrmsProjesi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.ExtensionMethod;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
@Table(name="employers")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @NotBlank
    @Column(name="company_name")
    private String companyName;

    @Column(name="web_address")
    private String webAddress;

    @NotEmpty
    @NotBlank
    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="email",unique = true)
    @NotBlank
    @NotEmpty
    @Email
    private String email;

    @Column(name="password")
    @NotBlank
    @NotEmpty
    private String password;

    @Column(name="is_activated_by_employee")
    private boolean isActivatedByEmployee;

    @OneToMany(mappedBy = "employer")
    private List<JobPosting> jobPostings;
}