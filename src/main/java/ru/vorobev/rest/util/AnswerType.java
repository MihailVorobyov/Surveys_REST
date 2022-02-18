package ru.vorobev.rest.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public enum AnswerType {
	TEXT("text"),
	RADIO("radio"),
	CHECKBOX("checkbox");
	
	@JsonProperty("value")
	private final String value;
	
	private AnswerType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
