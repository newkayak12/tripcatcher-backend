package com.tripcatcher.tripcatcherbackend.adminController;

import com.tripcatcher.tripcatcherbackend.common.exceptions.AccessDenied;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import service.AdminService;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping(value = "/admin/sign")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

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

    @RequestMapping(value = "/signIn",method = RequestMethod.GET)
    public Map<String,Object> signIn(@RequestParam String id, @RequestParam String password, @RequestParam String ipAddress) throws AccessDenied {
        return adminService.signIn(id, password, ipAddress);
    }
}
