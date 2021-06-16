package com.HrmsProjesi.services.abstracts;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.Language;

import java.util.List;

public interface LanguageService {
    public DataResult<List<Language>> getAll();

    public Result add(Language language);

    public Result delete(int id);

    public Result update(int id, Language language);

    public DataResult<Language> getById(int id);

}
