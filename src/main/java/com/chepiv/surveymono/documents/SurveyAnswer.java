package com.chepiv.surveymono.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

/**
 * Created by chepiv on 27/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */

@Document
@Data
public class SurveyAnswer {

    @Id
    private String id;
    @DocumentReference
    private Survey survey;
    private String surveyId;
    private String firstName;
    private String lastName;
    private List<AnswerEntry> entries;
}
