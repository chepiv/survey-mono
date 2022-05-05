package com.chepiv.surveymono.repository;

import com.chepiv.surveymono.documents.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by chepiv on 27/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
public interface AnswerRepository extends MongoRepository<Answer, String> {
}
