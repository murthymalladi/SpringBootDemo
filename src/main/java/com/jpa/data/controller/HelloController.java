package com.jpa.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dmalladi
 */

@RestController
public class HelloController {

    @RequestMapping(value="/hello")
    public String hello() {
        return "hello murthy";
    }
}
