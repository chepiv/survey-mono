package com.chepiv.surveymono.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by chepiv on 26/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */

@Data
public class Question {

    @Id
    private String id;
    private String question;
    private String type;
    private List<String> possibleAnswers;

}
