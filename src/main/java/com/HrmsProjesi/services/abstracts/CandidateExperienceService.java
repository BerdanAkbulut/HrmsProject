package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.CandidateExperience;

import java.util.List;

public interface CandidateExperienceService {

    public DataResult<List<CandidateExperience>> getAll();

    public Result add(CandidateExperience candidateExperience);

    public Result delete(int id);

    public Result update(int id, CandidateExperience candidateExperience);

    public DataResult<CandidateExperience> getById(int id);

}
