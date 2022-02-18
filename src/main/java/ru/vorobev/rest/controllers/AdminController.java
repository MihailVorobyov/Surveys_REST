package ru.vorobev.rest.controllers;

import org.springframework.web.bind.annotation.*;
import ru.vorobev.rest.entities.Answer;
import ru.vorobev.rest.entities.Question;
import ru.vorobev.rest.entities.Survey;
import ru.vorobev.rest.util.AnswerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	
	@GetMapping("surveys")
	private List<Survey> getAllSurveys() {
		//repository.getAll();
		
		//----------------------
		Answer answer1_1 = new Answer("answer1_text", "answer1_body");
		Question question1 = new Question(null, "Question1_text", AnswerType.TEXT, Collections.singletonList(answer1_1));
		
		Answer answer2_1 = new Answer("answer1_text", "answer1_body");
		Answer answer2_2 = new Answer("answer2_text", "answer2_body");
		Answer answer2_3 = new Answer("answer3_text", "answer3_body");
		Question question2 = new Question(2L, "Question2_text", AnswerType.RADIO, Arrays.asList(answer2_1, answer2_2, answer2_3));
		
		Survey survey1 = new Survey(1L, "Survey_1", "Description for Survey_1", Arrays.asList(question1, question2));
		//----------------------

		List<Survey> surveys = new ArrayList<>();
		surveys.add(survey1);

		return surveys;
	}
	
	@PutMapping("surveys/add")
	private void addSurvey(@RequestBody Survey newSurvey) {
//		repository.save(newSurvey);
		System.out.println(newSurvey);
	}
	
	@PutMapping("surveys/update")
	private void updateSurvey (@RequestBody Survey surveyToUpdate) {
		//repository.save(surveyToUpdate);
	}
	
	@DeleteMapping("surveys/delete")
	private void deleteSurvey (@RequestParam("id") Long id) {
		//repository.delete(id);
		System.out.println("deleting survey with id = " + id);
	}
}
