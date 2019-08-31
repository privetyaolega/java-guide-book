package eis.com.dev.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Stream;

@Aspect
@Component
public class CRMLoggingAspect {
    private Logger log = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* eis.com.dev.controller.*.*(..))")
    private void forControllerPackage() {

    }

    @Pointcut("execution(* eis.com.dev.dao.*.*(..))")
    private void forDaoPackage() {

    }

    @Pointcut("execution(* eis.com.dev.service.*.*(..))")
    private void forServicePackage() {

    }

    @Pointcut("forControllerPackage() || forDaoPackage() || forServicePackage()")
    private void forAppFlow() {

    }

    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().toShortString();
        log.info("===>>> in @Before: calling method: " + method);

        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(arg -> log.info("===>>> arguments: " + arg));
    }
}
