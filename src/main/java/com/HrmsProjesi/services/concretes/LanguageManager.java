package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.LanguageDao;
import com.HrmsProjesi.entities.Language;
import com.HrmsProjesi.services.abstracts.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {


    private final LanguageDao languageDao;

    public LanguageManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<>(languageDao.findAll(),"Diller getirildi");
    }

    @Override
    public Result add(Language language) {
        languageDao.save(language);
        return new SuccessResult("Dil Eklendi");
    }

    @Override
    public Result delete(int id) {
        languageDao.deleteById(id);
        return new SuccessResult("Dil silindi");
    }

    @Override
    public Result update(int id, Language language) {
        return null;
    }

    @Override
    public DataResult<Language> getById(int id) {
        return new SuccessDataResult<>(languageDao.getById(id),"Dil getirildi");
    }
}
