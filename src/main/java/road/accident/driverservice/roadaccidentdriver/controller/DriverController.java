package road.accident.driverservice.roadaccidentdriver.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import road.accident.driverservice.roadaccidentdriver.dto.DriverDTO;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;
import road.accident.driverservice.roadaccidentdriver.service.DriverService;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class DriverController {
    private final DriverService service;


    @GetMapping("/drivers/all")
    public List<DriverEntity> getAllDrivers(){
        return service.getAllDrivers();
    }

    @GetMapping("/driver/{id}")
    public DriverDTO getDriverById(@RequestParam("id") Long id) {
        return service.getDriverById(id);
    }

    @PostMapping("/driver")
    public void createDriver(@RequestBody DriverDTO dto){
        service.create(dto);
    }

    @PutMapping("/driver/{id}")
    public void updateDriver(@RequestParam("id") Long id, @RequestBody DriverDTO dto) {
        service.updateDriver(id, dto);
    }

}
