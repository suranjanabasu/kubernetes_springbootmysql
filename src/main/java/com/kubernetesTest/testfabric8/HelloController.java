package com.kubernetesTest.testfabric8;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/testkube")
@Slf4j
public class HelloController {

    @GetMapping
    public String hello() {
        log.info("View method called");
        return "Hello World";
    }
}
