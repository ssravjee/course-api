package com.keepleritlimited.springboot.topic;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping(path = "/api/topics")
@Api(value = "TopicControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class TopicController {
    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = Topic.class)})
     public List<Topic> getTopics() {
        return Arrays.asList(
                new Topic("spring","Spring famework", "Spring Framework Description"),
                new Topic("java","Core Java famework", "Core Java Framework Description"),
                new Topic("javascript","javascript famework", "javascript Framework Description")
        );
    }
}
