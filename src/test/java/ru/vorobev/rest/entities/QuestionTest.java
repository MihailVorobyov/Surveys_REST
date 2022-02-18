package ru.vorobev.rest.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vorobev.rest.util.AnswerType;

import java.util.Collections;

public class QuestionTest {
	
	@Test
	public void shouldReturnText() {
		Answer answer1_1 = new Answer("answer1_text", "answer1_body");
		Question q = new Question(null, "Question1_text", AnswerType.TEXT, Collections.singletonList(answer1_1));
		
		Assertions.assertEquals(AnswerType.TEXT, q.getAnswerType());
	}
}
