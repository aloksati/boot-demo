package com.example.bootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.repository.TopicRepository;

@RestController
public class TopicController {

	@Autowired
	private TopicRepository repo;
	
	@GetMapping(path = "topics/linkedbythree")
	public Object[] getTopicsLinkedWithThree(){
		
		return repo.getTopicsLinkedWithThree();
		
	}
}
