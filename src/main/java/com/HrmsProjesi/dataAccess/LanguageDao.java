package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language,Integer> {
}
