package com.HrmsProjesi.dataAccess;

import com.HrmsProjesi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
}
