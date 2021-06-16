package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.CandidateExperience;
import com.HrmsProjesi.entities.City;

import java.util.List;

public interface CityService {
    public DataResult<List<City>> getAll();

    public Result add(City city);

    public Result delete(int id);

    public Result update(int id, City city);

    public DataResult<City> getById(int id);


}
