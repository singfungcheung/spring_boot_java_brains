package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired // Marks this as something that needs dependency injection.
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        // Converts to Json automatically and returns as HTTP response.
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") // {} is a variable portion.
    public Topic getTopic(@PathVariable String id) { // @PathVariable maps the {id} to the argument
        return topicService.getTopic(id);
    }
}
