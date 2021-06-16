package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvDao extends JpaRepository<Cv,Integer> {
}
