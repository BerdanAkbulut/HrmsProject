package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.CandidateDao;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.services.abstracts.CandidateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    CandidateDao candidateDao;

    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {

        return new SuccessDataResult<>(candidateDao.findAll(),"Adaylar listelendi");
    }

    @Override
    public Result addCandidate(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("Aday kayıt edildi");
    }

    @Override
    public Result deleteCandidate(int id) {
        this.candidateDao.deleteById(id);
        return new SuccessResult("Aday silindi");
    }

    @Override
    public Result updateCandidate(int id, Candidate candidate) {
        return null;
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<>(this.candidateDao.getById(id),"Aday getirildi.");
    }
}
