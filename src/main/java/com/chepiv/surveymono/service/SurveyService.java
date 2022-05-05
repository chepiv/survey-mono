package com.chepiv.surveymono.service;

import com.chepiv.surveymono.documents.Survey;
import com.chepiv.surveymono.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
@Service
public class SurveyService {

    private final SurveyRepository surveyRepository;

    @Autowired
    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }

    public List<Survey> getAll() {
        return surveyRepository.findAll();
    }

    public Optional<Survey> getById(String id) {
        return surveyRepository.findById(id);
    }

    public Optional<Survey> findByTitle(String title) {
        return surveyRepository.findFirstByTitle(title);
    }

}
