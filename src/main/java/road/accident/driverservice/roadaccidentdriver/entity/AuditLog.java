package road.accident.driverservice.roadaccidentdriver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLog {
    @Id
    private Long id;

    private LocalDateTime timestamp;

    private Integer executionTime;
    private String result;
    private String exception;

}
