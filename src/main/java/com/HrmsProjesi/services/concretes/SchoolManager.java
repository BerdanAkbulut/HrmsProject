package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.SchoolDao;
import com.HrmsProjesi.entities.School;
import com.HrmsProjesi.services.abstracts.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolManager implements SchoolService {

private  final SchoolDao schoolDao;

    public SchoolManager(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public DataResult<List<School>> getAll() {
        return new SuccessDataResult<>(schoolDao.findAll(),"Okullar getirildi");
    }

    @Override
    public Result add(School school) {
        schoolDao.save(school);
        return new SuccessResult("Okul eklendi");
    }

    @Override
    public Result delete(int id) {
        schoolDao.deleteById(id);
        return new SuccessResult("Okul silindi");
    }

    @Override
    public Result update(int id, School school) {
        return null;
    }

    @Override
    public DataResult<School> getById(int id) {
        return new SuccessDataResult<>(schoolDao.getById(id),"Okul getirildi");
    }
}
