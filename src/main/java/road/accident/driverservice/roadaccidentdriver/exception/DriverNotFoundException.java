package road.accident.driverservice.roadaccidentdriver.exception;

import javax.persistence.EntityNotFoundException;

public class DriverNotFoundException extends EntityNotFoundException {

    public DriverNotFoundException(String message) {
        super(message);
    }

    public DriverNotFoundException() {
    }
}
