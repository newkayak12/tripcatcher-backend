package com.tripcatcher.tripcatcherbackend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class testCon {
    @RequestMapping(value = "/tt", method = RequestMethod.GET)
    public String test(){
        log.warn("??");
        return "!!";
    }
}
