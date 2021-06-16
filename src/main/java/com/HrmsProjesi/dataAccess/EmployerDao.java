package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
