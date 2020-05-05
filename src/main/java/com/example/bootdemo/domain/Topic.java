package com.example.bootdemo.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Topic implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Topic() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy = "topic")
	private List<SubTopic> subtopic;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Topic topicparent;
	
	@OneToMany(mappedBy = "topicparent")
	private List<Topic> topicchildren;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {		
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SubTopic> getSubtopic() {
		return subtopic;
	}
	public void setSubtopic(List<SubTopic> subtopic) {
		this.subtopic = subtopic;
	}
	public Topic getTopicparent() {
		return topicparent;
	}
	public void setTopicparent(Topic topicparent) {
		this.topicparent = topicparent;
	}
	public List<Topic> getTopicchildren() {
		return topicchildren;
	}
	public void setTopicchildren(List<Topic> topicchildren) {
		this.topicchildren = topicchildren;
	}


}
