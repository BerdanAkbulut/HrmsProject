package com.HrmsProjesi.api;

import com.HrmsProjesi.core.results.ErrorDataResult;
import com.HrmsProjesi.entities.City;
import com.HrmsProjesi.entities.Language;
import com.HrmsProjesi.services.abstracts.CityService;
import com.HrmsProjesi.services.abstracts.LanguageService;
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
@RequestMapping("/api/languages")
public class LanguageController {

    LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(languageService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody Language language) {
        return ResponseEntity.ok(languageService.add(language));
    }
    @GetMapping("delete")
    public ResponseEntity<?> delete(@RequestParam  int id) {
        return  ResponseEntity.ok(languageService.delete(id));
    }
    @GetMapping("getbyid")
    public ResponseEntity<?> getById(@RequestParam int id) {
        return ResponseEntity.ok(languageService.getById(id));
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
