package road.accident.driverservice.roadaccidentdriver.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import road.accident.driverservice.roadaccidentdriver.dto.ErrorDTO;

import javax.persistence.EntityNotFoundException;

@Slf4j
@ControllerAdvice
public class ExpceptionHandlerInterceptor {
    @ExceptionHandler({DriverNotFoundException.class})
    @ResponseBody
    public ErrorDTO handlerNotFoundException(EntityNotFoundException entityNotFoundException){
        log.error("exception caught by advice {}", entityNotFoundException.getMessage());
        return ErrorDTO.builder()
                .statusCode("400")
                .message(entityNotFoundException.getMessage())
                .build();
    }
}
