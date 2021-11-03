package road.accident.driverservice.roadaccidentdriver.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import road.accident.driverservice.roadaccidentdriver.dto.CarDTO;
import road.accident.driverservice.roadaccidentdriver.dto.DriverDTO;
import road.accident.driverservice.roadaccidentdriver.entity.CarEntity;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDTO toDto(CarEntity car);
    List<CarDTO> conveter(List<CarEntity> carEntities);

    CarEntity toEntity(CarDTO dto);
}

