package road.accident.driverservice.roadaccidentdriver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DriverDTO {

    private Long id;
    private String name;
    private Date driverFrom;
}
