package road.accident.driverservice.roadaccidentdriver.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import road.accident.driverservice.roadaccidentdriver.dto.DriverDTO;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;
import road.accident.driverservice.roadaccidentdriver.exception.DriverNotFoundException;
import road.accident.driverservice.roadaccidentdriver.mapper.DriverMapper;
import road.accident.driverservice.roadaccidentdriver.repository.DriverRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository repository;

    public List<DriverEntity> getAllDrivers() {
        return repository.findAll();
    }

    public DriverDTO getDriverById(Long id) {
        var driverEntity = getDriverEntityById(id);
        return DriverMapper.INSTANCE.toDto(driverEntity);

    }

    public void create(DriverDTO dto) {
        var driverEntity = DriverMapper.INSTANCE.toEntity(dto);
        repository.save(driverEntity);
    }

    public void updateDriver(Long id, DriverDTO dto) {
        var driver = getDriverEntityById(id);
        driver.setDriverFrom(dto.getDriverFrom());
        driver.setName(dto.getName());
        repository.save(driver);
    }

    public void deleteDriver(Long id) {
        var driver = getDriverEntityById(id);
        driver.setCanDrive(false);
        repository.save(driver);
    }

    public DriverEntity getDriverEntityById(Long id) {
        var optionalDriver = repository.findById(id);
        if (optionalDriver.isEmpty()) {
            log.error("getDriverById.out - player with ID {} not found", id);
            throw new DriverNotFoundException(String.format("Player with id %s not found", id));
        }
        return optionalDriver.get();
    }
}