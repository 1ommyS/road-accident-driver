package road.accident.driverservice.roadaccidentdriver.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import road.accident.driverservice.roadaccidentdriver.dto.CarDTO;
import road.accident.driverservice.roadaccidentdriver.dto.DriverDTO;
import road.accident.driverservice.roadaccidentdriver.entity.CarEntity;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;
import road.accident.driverservice.roadaccidentdriver.service.CarService;
import road.accident.driverservice.roadaccidentdriver.service.DriverService;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CarController {
    private final CarService service;


    @GetMapping("/cars/all")
    public List<CarDTO> getAllCars(){
        return service.getAllCars();
    }

    @GetMapping("/car/{id}")
    public CarDTO getCarById(@PathVariable("id") Long id) {
        return service.getCarById(id);
    }

    @PostMapping("/car")
    public void buyCar(@RequestBody CarDTO dto){
        service.create(dto);
    }


}
