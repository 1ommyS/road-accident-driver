package road.accident.driverservice.roadaccidentdriver.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import road.accident.driverservice.roadaccidentdriver.dto.DriverDTO;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;

import java.util.List;


@Mapper(componentModel = "spring")
public interface DriverMapper {
    DriverMapper INSTANCE = Mappers.getMapper(DriverMapper.class);
    DriverDTO toDto(DriverEntity driver);
    List<DriverDTO> conveter(List<DriverEntity> driverEntities);
    DriverEntity toEntity(DriverDTO dto);
}

