package com.kalpesh.demospring.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Descraption"),
			new Topic("Java", "Java 8", "Java Descraption"), new Topic("Python", "AIML, NLTK", "Python Descraption")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topicObj) {
		topics.stream().filter(t -> t.getId().equals(id)).forEach(item -> {
			item.setDescraption(topicObj.getDescraption());
			item.setName(topicObj.getName());
		});

//		topics.forEach(topic -> {
//			if (topic.getId().equals(id)) {
//				topic.setDescraption(topicObj.getDescraption());
//				topic.setName(topicObj.getName());
//				return;
//			}
//		});
	}

	public void deleteTopic(String id) {
		topics.removeIf(item -> item.getId().equals(id));
	}

}
