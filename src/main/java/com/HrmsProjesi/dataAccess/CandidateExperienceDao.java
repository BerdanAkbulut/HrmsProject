package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.CandidateExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CandidateExperienceDao extends JpaRepository<CandidateExperience,Integer> {

    
}
