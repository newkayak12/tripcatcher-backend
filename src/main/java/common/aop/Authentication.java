package common.aop;

import common.auth.TokenManager;
import common.constcode.ConstCode;
import common.exceptions.AccessDenied;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;
import java.util.Objects;

@Component
@Aspect
public class Authentication {
    TokenManager tokenManager = new TokenManager();
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Around("@annotation(common.annotation.Decrypt)")
    public Object decrypt(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Object[] parameterValue = proceedingJoinPoint.getArgs();
        Parameter[] parameters = methodSignature.getMethod().getParameters();
        for(int i = 0; i<parameters.length; i++){
            if(parameters[i].getName().equals("authorization")){
                if(Objects.isNull(parameterValue[i])){
                    throw new AccessDenied("잘못된 접근입니다.");
                }
                parameterValue[i] = tokenManager.decrypt((String)parameterValue[i], ConstCode.SALT);
                break;
            }
        }
        return proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
    }
}
