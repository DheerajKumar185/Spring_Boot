package com.tech.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Java", "Java 8", "Lambda expression"),
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Hibernamte", "Hibernate Framework", "Hibernate Framework Description")
			));
	
	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}

}
