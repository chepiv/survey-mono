package com.chepiv.surveymono.repository;

import com.chepiv.surveymono.documents.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by chepiv on 27/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
public interface AnswerRepository extends MongoRepository<Answer, String> {
    @Query(value = "{'survey.title': ?0}")
    List<Answer> findAllBySurveyTitle(String title);

    List<Answer> findAllBySurveyId(String surveyId);
}
