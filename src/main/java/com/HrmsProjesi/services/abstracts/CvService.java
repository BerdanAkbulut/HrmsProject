package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.Cv;

import java.util.List;

public interface CvService {
    public DataResult<List<Cv>> getAll();

    public Result add(Cv cv);

    public Result delete(int id);

    public Result update(int id, Cv cv);

    public DataResult<Cv> getById(int id);

}
