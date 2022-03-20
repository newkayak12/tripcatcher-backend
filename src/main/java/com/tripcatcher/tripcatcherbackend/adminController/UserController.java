package com.tripcatcher.tripcatcherbackend.adminController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping(value = "/admin/sign")
@CrossOrigin("*")
public class UserController {
    @RequestMapping(value = "/getIp",method = RequestMethod.GET)
    public String getIp(HttpServletRequest request){
        String ip = request.getHeader("X-Forwarded-For");
        log.warn("IP {}",ip);
        if(ip == null){
            ip = request.getHeader("Proxy-Client-IP");
            log.warn("IP {}",ip);
        }
        if(ip == null){
            ip = request.getHeader("WL-Proxy-Client-IP");
            log.warn("IP {}",ip);
        }
        if(ip == null){
            ip = request.getHeader("HTTP_CLIENT_IP");
            log.warn("IP {}",ip);
        }
        if(ip == null){
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            log.warn("IP {}",ip);
        }
        if(ip==null){
            ip = request.getRemoteAddr();
            log.warn("IP {}",ip);
        }
        log.warn("IP {}",ip);
        return ip;
    }
}
