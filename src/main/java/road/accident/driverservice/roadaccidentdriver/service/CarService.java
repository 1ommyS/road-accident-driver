package road.accident.driverservice.roadaccidentdriver.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import road.accident.driverservice.roadaccidentdriver.dto.CarDTO;
import road.accident.driverservice.roadaccidentdriver.dto.DriverDTO;
import road.accident.driverservice.roadaccidentdriver.entity.CarEntity;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;
import road.accident.driverservice.roadaccidentdriver.exception.DriverNotFoundException;
import road.accident.driverservice.roadaccidentdriver.mapper.CarMapper;
import road.accident.driverservice.roadaccidentdriver.mapper.DriverMapper;
import road.accident.driverservice.roadaccidentdriver.repository.CarRepository;
import road.accident.driverservice.roadaccidentdriver.repository.DriverRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService {
    private final CarRepository repository;
    private final CarMapper mapper;

    public List<CarDTO> getAllCars() {
        return mapper.conveter(repository.findAll());
    }

    public CarDTO getCarById(Long id) {
        var carEntity = getCarEntityById(id);
        return mapper.toDto(carEntity);

    }

    public void create(CarDTO dto) {
        var carEntity = mapper.toEntity(dto);
        repository.save(carEntity);
    }

    public void updateDriver(Long id, CarDTO dto) {
        var car = getCarEntityById(id);
        car.setName(dto.getName());
        car.setHorsePoints(dto.getHorsePoints());
        car.setTagNumber(dto.getTagNumber());
        repository.save(car);
    }

    public CarEntity getCarEntityById(Long id) {
        var optionalDriver = repository.findById(id);
        if (optionalDriver.isEmpty()) {
            log.error("getDriverById.out - car with ID {} not found", id);
            throw new DriverNotFoundException(String.format("car with id %s not found", id));
        }
        return optionalDriver.get();
    }
}