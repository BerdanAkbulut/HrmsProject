package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.CvDao;
import com.HrmsProjesi.entities.Cv;
import com.HrmsProjesi.services.abstracts.CvService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvManager implements CvService {

    private final CvDao cvDao;


    public CvManager(CvDao cvDao) {
        this.cvDao = cvDao;
    }


    @Override
    public DataResult<List<Cv>> getAll() {
        return new SuccessDataResult<>(cvDao.findAll(),"Cv' ler getirildi");
    }

    @Override
    public Result add(Cv cv) {
        cvDao.save(cv);
        return new SuccessResult("Cv EKlendi");
    }

    @Override
    public Result delete(int id) {
        cvDao.deleteById(id);
        return new SuccessResult("Cv silindi");
    }

    @Override
    public Result update(int id, Cv cv) {
        return null;
    }

    @Override
    public DataResult<Cv> getById(int id) {
        return new SuccessDataResult<>(cvDao.getById(id),"Cv getirildi");
    }
}
