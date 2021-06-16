package com.HrmsProjesi.api;

import com.HrmsProjesi.core.results.ErrorDataResult;
import com.HrmsProjesi.entities.Candidate;
import com.HrmsProjesi.entities.Cv;
import com.HrmsProjesi.services.abstracts.CandidateService;
import com.HrmsProjesi.services.abstracts.CvService;
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
@RequestMapping("/api/cv")
public class CvController {

    CvService cvService;

    @Autowired
    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(cvService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody Cv cv) {
        return ResponseEntity.ok(cvService.add(cv));
    }
    @GetMapping("delete")
    public ResponseEntity<?> delete(@RequestParam  int id) {
        return  ResponseEntity.ok(cvService.delete(id));
    }
    @GetMapping("getbyid")
    public ResponseEntity<?> getById(@RequestParam int id) {
        return ResponseEntity.ok(cvService.getById(id));
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
