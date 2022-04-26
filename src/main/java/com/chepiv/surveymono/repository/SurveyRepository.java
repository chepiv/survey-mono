package com.chepiv.surveymono.repository;

import com.chepiv.surveymono.documents.Survey;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
public interface SurveyRepository extends MongoRepository<Survey, String> {
}
