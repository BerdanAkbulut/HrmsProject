package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
