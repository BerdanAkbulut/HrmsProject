package com.HrmsProjesi.api;

import com.HrmsProjesi.core.results.ErrorDataResult;
import com.HrmsProjesi.entities.City;
import com.HrmsProjesi.entities.JobPosition;
import com.HrmsProjesi.services.abstracts.CityService;
import com.HrmsProjesi.services.abstracts.JobPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {

    JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(jobPositionService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody JobPosition jobPosition) {
        return ResponseEntity.ok(jobPositionService.add(jobPosition));
    }
    @GetMapping("delete")
    public ResponseEntity<?> delete(@RequestParam  int id) {
        return  ResponseEntity.ok(jobPositionService.delete(id));
    }
    @GetMapping("getbyid")
    public ResponseEntity<?> getById(@RequestParam int id) {
        return ResponseEntity.ok(jobPositionService.getById(id));
    }




    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
        Map<String,String> validationErrors = new HashMap<String,String>();

        for(FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları");
        return errors;
    }
}
