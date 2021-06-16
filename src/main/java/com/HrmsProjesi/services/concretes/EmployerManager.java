package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.EmployerDao;
import com.HrmsProjesi.entities.Employer;
import com.HrmsProjesi.services.abstracts.EmployerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private final EmployerDao employerDao;


    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;

    }


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(employerDao.findAll(),"İş verenler getirildi");
    }

    @Override
    public Result add(Employer employer) {
        employerDao.save(employer);
        return new SuccessResult("İş veren eklendi");
    }


    @Override
    public Result delete(int id) {
        employerDao.deleteById(id);
        return new SuccessResult("İş veren silindi");
    }

    @Override
    public Result update(int id, Employer employer) {
        return null;
    }

    @Override
    public DataResult<Employer> getById(int id) {
        return new SuccessDataResult<>(employerDao.getById(id),"Employer getirildi");
    }
}
