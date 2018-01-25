package com.truecorp.nam.test.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAppController {

	@RequestMapping("/greeting")
    public String greeting() {
        return "Welcome to my application";
    }
}
