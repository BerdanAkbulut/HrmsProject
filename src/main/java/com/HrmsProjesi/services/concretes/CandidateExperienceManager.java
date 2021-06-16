package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.CandidateExperienceDao;
import com.HrmsProjesi.entities.CandidateExperience;
import com.HrmsProjesi.services.abstracts.CandidateExperienceService;
import com.HrmsProjesi.services.abstracts.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateExperienceManager implements CandidateExperienceService {

    CandidateExperienceDao candidateExperienceDao;

    public CandidateExperienceManager(CandidateExperienceDao candidateExperienceDao) {
        this.candidateExperienceDao = candidateExperienceDao;
    }

    @Override
    public DataResult<List<CandidateExperience>> getAll() {

        return new SuccessDataResult<>(candidateExperienceDao.findAll(),"Aday tecrübeleri listelendi");
    }

    @Override
    public Result add(CandidateExperience candidateExperience) {
        this.candidateExperienceDao.save(candidateExperience);
        return new SuccessResult("Aday tecrübesi eklendi");
    }

    @Override
    public Result delete(int id) {
        this.candidateExperienceDao.deleteById(id);
        return new SuccessResult("Aday tecrübesi silindi");
    }

    @Override
    public Result update(int id, CandidateExperience candidateExperience) {
        return null;
    }

    @Override
    public DataResult<CandidateExperience> getById(int id) {
        return new SuccessDataResult<>(this.candidateExperienceDao.getById(id),"Aday tecrübesi getirildi.");
    }
}
