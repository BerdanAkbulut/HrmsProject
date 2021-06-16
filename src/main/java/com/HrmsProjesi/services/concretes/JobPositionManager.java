package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.JobPositionDao;
import com.HrmsProjesi.entities.JobPosition;
import com.HrmsProjesi.services.abstracts.JobPositionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private final JobPositionDao jobPositionDao;

    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<>(jobPositionDao.findAll(),"İş pozisyonları getirildi");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        jobPositionDao.save(jobPosition);
        return new SuccessResult("İş pozisyonu eklendi");
    }

    @Override
    public Result delete(int id) {
        jobPositionDao.deleteById(id);
        return new SuccessResult("İş pozisyonu silindi");
    }

    @Override
    public Result update(int id, JobPosition jobPosition) {
        return null;
    }

    @Override
    public DataResult<JobPosition> getById(int id) {
        return new SuccessDataResult<>(jobPositionDao.getById(id),"İş pozisoynu getirildi");
    }
}
