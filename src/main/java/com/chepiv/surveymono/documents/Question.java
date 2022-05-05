package com.chepiv.surveymono.documents;

import lombok.Data;

import java.util.List;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */

@Data
public class Question {
    private String question;
    private String type;
    private List<String> possibleAnswers;

}
