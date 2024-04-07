package com.sabrek.quiz.controller;

import com.sabrek.quiz.service.QuizServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "quiz")
public class QuizController {

    @Autowired
    QuizServie quizService;

    @PostMapping(value = "create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return quizService.createQuiz(category,numQ,title);
    }
}
