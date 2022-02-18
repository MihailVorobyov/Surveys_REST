package ru.vorobev.rest.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.vorobev.rest.util.AnswerType;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Entity
//@Table(name = "questions")
@Getter
@Setter
public class Question {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	@JsonProperty("id")
	private Long id;
	
//	@Column(name = "title")
	@JsonProperty("text")
	private String text;
	
	@JsonProperty("type")
	private AnswerType answerType;
	
	@JsonProperty("answers")
	private List<Answer> answers;
	
	public Question() {
	}
	
	
	public Question(Long id, String text, AnswerType answerType, List<Answer> answers) {
		this.id = id;
		this.text = text;
		this.answerType = answerType;
		this.answers = answers;
	}
}
