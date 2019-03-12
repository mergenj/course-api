package com.springboot.coursesapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private  TopicService topicService;



    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id){
        return topicService.getTopicById(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopicById(@RequestBody Topic topic){
        topicService.updateTopicById(topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopicById(@PathVariable String id){
        topicService.deleteTopicById(id);
    }
}
