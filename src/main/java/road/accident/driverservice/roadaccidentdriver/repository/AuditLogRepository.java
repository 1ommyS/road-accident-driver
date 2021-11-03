package road.accident.driverservice.roadaccidentdriver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import road.accident.driverservice.roadaccidentdriver.entity.AuditLog;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}