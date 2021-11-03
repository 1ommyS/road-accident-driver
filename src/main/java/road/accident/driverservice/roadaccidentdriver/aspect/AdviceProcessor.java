package road.accident.driverservice.roadaccidentdriver.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AdviceProcessor {
    @Around("@annotation(road.accident.driverservice.roadaccidentdriver.aspect.Loggable)")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long exectuionTime = System.currentTimeMillis()-start;

        return proceed;
    }



}
