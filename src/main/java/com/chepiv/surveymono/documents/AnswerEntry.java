package com.chepiv.surveymono.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by chepiv on 27/04/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */

@Data
public class AnswerEntry {
    @Id
    private String id;
    private Question question;
    private String answer;
}
