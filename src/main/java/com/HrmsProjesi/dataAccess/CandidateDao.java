package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    Candidate getByFirstName(String firstName);

    Candidate getByFirstNameOrLastName(String firstName,String lastName);

    List<Candidate> getByIdIn(List<Integer> candidateIds);

    List<Candidate> getByFirstNameContains(String firstName);

    List<Candidate> getByFirstNameStartsWith(String firstName);


}
