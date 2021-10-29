package road.accident.driverservice.roadaccidentdriver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
}