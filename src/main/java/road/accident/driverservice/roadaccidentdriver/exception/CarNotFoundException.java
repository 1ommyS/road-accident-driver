package road.accident.driverservice.roadaccidentdriver.exception;

import javax.persistence.EntityNotFoundException;

public class CarNotFoundException extends EntityNotFoundException {

    public CarNotFoundException(String message) {
        super(message);
    }
}
