package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.Employer;

import java.util.List;

public interface EmployerService {
    public DataResult<List<Employer>> getAll();

    public Result add(Employer employer);

    public Result delete(int id);

    public Result update(int id, Employer employer);

    public DataResult<Employer> getById(int id);

}
