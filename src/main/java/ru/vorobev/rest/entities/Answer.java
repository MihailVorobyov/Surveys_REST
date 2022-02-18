package ru.vorobev.rest.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Answer {
	
	@JsonProperty("answer_case")
	private String answer_case;
	
	@JsonProperty("choice")
	private String choice;
	
	public Answer(String answer_case, String choice) {
		this.answer_case = answer_case;
		this.choice = choice;
	}
	
}
