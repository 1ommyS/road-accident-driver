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

@Service
@Slf4j
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository repository;
    private final DriverMapper mapper;

    public List<DriverDTO> getAllDrivers() {
        return mapper.conveter(repository.findAll());
    }

    public DriverDTO getDriverById(Long id) {
        var driverEntity = getDriverEntityById(id);
        return mapper.driverToDriverDto(driverEntity);
    }

    public void create(DriverDTO dto) {
        repository.save(mapper.toEntity(dto));
    }


    public DriverEntity getDriverEntityById(Long id) {
        var optionalDriver = repository.findById(id);
        if (optionalDriver.isEmpty()) {
            log.error("getDriverById.out - Driver with ID {} not found", id);
            throw new DriverNotFoundException(String.format("Driver with id %s not found", id));
        }
        return optionalDriver.get();
    }
}