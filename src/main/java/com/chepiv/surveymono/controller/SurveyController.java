package com.chepiv.surveymono.controller;

import com.chepiv.surveymono.documents.Survey;
import com.chepiv.surveymono.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
@RestController
@RequestMapping("/survey")
public class SurveyController {

    private final SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @PostMapping
    public Survey save(@RequestBody Survey survey) {
        return surveyService.save(survey);
    }

    @GetMapping
    public List<Survey> getAll() {
        return surveyService.getAll();
    }

}
