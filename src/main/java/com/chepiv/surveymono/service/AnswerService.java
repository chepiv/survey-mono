package com.chepiv.surveymono.service;

import com.chepiv.surveymono.documents.Answer;
import com.chepiv.surveymono.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by chepiv on 05/05/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    public List<Answer> findAllBySurveyTitle(String title) {
        return answerRepository.findAllBySurveyTitle(title);
    }

    public List<Answer> findAllBySurveyId(String surveyId) {
        return answerRepository.findAllBySurveyId(surveyId);
    }

    public Optional<Answer> findById(String id) {
        return answerRepository.findById(id);
    }

}
