package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {
}
