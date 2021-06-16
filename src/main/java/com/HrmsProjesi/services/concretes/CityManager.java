package com.HrmsProjesi.services.concretes;

import com.HrmsProjesi.core.results.DataResult;
import com.HrmsProjesi.core.results.Result;
import com.HrmsProjesi.core.results.SuccessDataResult;
import com.HrmsProjesi.core.results.SuccessResult;
import com.HrmsProjesi.dataAccess.CityDao;
import com.HrmsProjesi.entities.City;
import com.HrmsProjesi.services.abstracts.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private final CityDao cityDao;

    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<>(cityDao.findAll(),"Şehirler getirildi");
    }

    @Override
    public Result add(City city) {
        cityDao.save(city);
       return new SuccessResult("Şehir eklendi");
    }

    @Override
    public Result delete(int id) {
        cityDao.deleteById(id);
        return new SuccessResult("Şehir silindi");
    }

    @Override
    public Result update(int id, City city) {
        return null;
    }

    @Override
    public DataResult<City> getById(int id) {

        return new  SuccessDataResult<>(cityDao.getById(id),"Şehir getirildi");
    }
}
