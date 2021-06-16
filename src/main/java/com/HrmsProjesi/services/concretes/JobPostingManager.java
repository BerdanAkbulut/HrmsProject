package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.JobPostingDao;
import com.HrmsProjesi.entities.JobPosting;
import com.HrmsProjesi.services.abstracts.JobPostingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingManager implements JobPostingService {

    private final JobPostingDao jobPostingDao;

    public JobPostingManager(JobPostingDao jobPostingDao) {
        this.jobPostingDao = jobPostingDao;
    }

    @Override
    public DataResult<List<JobPosting>> getAll() {
        return new SuccessDataResult<>(jobPostingDao.findAll(),"İşler getirildi");
    }

    @Override
    public Result add(JobPosting jobPosting) {
        jobPostingDao.save(jobPosting);
        return new SuccessResult("İş eklendi");
    }

    @Override
    public Result delete(int id) {
        jobPostingDao.deleteById(id);
        return new SuccessResult("İş silindi");
    }

    @Override
    public Result update(int id, JobPosting jobPosting) {
        return null;
    }

    @Override
    public DataResult<JobPosting> getById(int id) {
        return new SuccessDataResult<>(jobPostingDao.getById(id),"İş getirildi");
    }
}
