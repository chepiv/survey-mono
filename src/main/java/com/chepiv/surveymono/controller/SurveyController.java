package com.chepiv.surveymono.controller;

import com.chepiv.surveymono.documents.Survey;
import com.chepiv.surveymono.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
@RestController
@RequestMapping("api/survey")
public class SurveyController {

    private final SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @PostMapping
    public ResponseEntity<Survey> save(@RequestBody Survey survey) {
        return ResponseEntity.ok(surveyService.save(survey));
    }

    @GetMapping
    public ResponseEntity<List<Survey>> getAll() {
        return ResponseEntity.ok(surveyService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Survey> getById(@PathVariable String id) {
        return ResponseEntity.of(surveyService.getById(id));
    }

//    @GetMapping
//    public ResponseEntity<Survey> getByTitle(@RequestParam(name = "title") String title) {
//        return ResponseEntity.of(surveyService.findByTitle(title));
//    }

}
