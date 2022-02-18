package ru.vorobev.rest.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//@Entity
@Getter
@Setter
public class Survey {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("start-time")
	private Date startTime;
	
	@JsonProperty("end-time")
	private Date endTime;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("questions")
	List<Question> questions;
	
	public Survey() {
		this.id = null;
		this.title = null;
		this.startTime = null;
		this.endTime = null;
		this.description = null;
		this.questions = null;
	}
	
	public Survey(Long id, String title, String description, List<Question> questions) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.questions = questions;
	}
	
	public Survey(Long id, String title, Date startTime, Date endTime, String description, List<Question> questions) {
		this.id = id;
		this.title = title;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
		this.questions = questions;
	}
	
	@Override
	public String toString() {
		return "Survey{" +
			"id=" + id +
			", title='" + title + '\'' +
			", startTime=" + startTime +
			", endTime=" + endTime +
			", description='" + description + '\'' +
			", questions=" + questions +
			'}';
	}
}
