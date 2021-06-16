package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;

import java.util.List;

public interface CandidateService {
    public DataResult<List<Candidate>> getAll();

    public Result addCandidate(Candidate candidate);

    public Result deleteCandidate(int id);

    public Result updateCandidate(int id, Candidate candidate);

    public DataResult<Candidate> getById(int id);

}
