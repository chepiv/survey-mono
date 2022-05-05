package com.chepiv.surveymono.controller;

import com.chepiv.surveymono.documents.Answer;
import com.chepiv.surveymono.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chepiv on 05/05/2022.
 * Contact: chepurin.ivan@gmail.com
 * Github:chepiv
 */
@RestController
@RequestMapping("/answer")
public class AnswerController {

    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public ResponseEntity<List<Answer>> getAll() {
        return ResponseEntity.ok(answerService.findAll());
    }

    @PostMapping
    public ResponseEntity<Answer> save(Answer answer) {
        return ResponseEntity.ok(answerService.save(answer));
    }
}
