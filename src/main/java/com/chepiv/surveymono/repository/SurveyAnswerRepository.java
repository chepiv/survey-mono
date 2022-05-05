package com.chepiv.surveymono.repository;

import com.chepiv.surveymono.documents.SurveyAnswer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by chepiv on 27/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
public interface SurveyAnswerRepository extends MongoRepository<SurveyAnswer, String> {
}
