package org.career.skills.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstWeb {

    @RequestMapping("/first")
    public String firstCode() {
        return "hello,web";
    }
}
