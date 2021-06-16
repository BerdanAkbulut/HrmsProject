package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<School,Integer> {
}
