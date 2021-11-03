package road.accident.driverservice.roadaccidentdriver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import road.accident.driverservice.roadaccidentdriver.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}