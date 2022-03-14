package com.tripcatcher.tripcatcherbackend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@Slf4j
@RequestMapping("/api/user")
public class UserController {
}