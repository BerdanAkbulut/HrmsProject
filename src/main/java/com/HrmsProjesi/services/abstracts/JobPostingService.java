package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.JobPosting;

import java.util.List;

public interface JobPostingService {
    public DataResult<List<JobPosting>> getAll();

    public Result add(JobPosting jobPosting);

    public Result delete(int id);

    public Result update(int id, JobPosting jobPosting);

    public DataResult<JobPosting> getById(int id);

}
