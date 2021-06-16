package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.School;

import java.util.List;

public interface SchoolService {
    public DataResult<List<School>> getAll();

    public Result add(School school);

    public Result delete(int id);

    public Result update(int id, School school);

    public DataResult<School> getById(int id);

}
