package com.example.bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bootdemo.domain.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer>{

	
	@Query(value = "SELECT  topicparent_id,count(*) FROM TOPIC group by topicparent_id having count(*)>3;",nativeQuery = true)
	public Object[] getTopicsLinkedWithThree();
	
	
}
