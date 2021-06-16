package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.JobPosition;

import java.util.List;

public interface JobPositionService {
    public DataResult<List<JobPosition>> getAll();

    public Result add(JobPosition jobPosition);

    public Result delete(int id);

    public Result update(int id,JobPosition jobPosition);

    public DataResult<JobPosition> getById(int id);

}
