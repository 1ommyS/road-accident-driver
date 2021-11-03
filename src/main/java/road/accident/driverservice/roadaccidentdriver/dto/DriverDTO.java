package road.accident.driverservice.roadaccidentdriver.dto;

import com.sun.istack.NotNull;

import java.util.Date;
import java.util.List;

public class DriverDTO {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Date driverFrom;

    @NotNull
    private List<CarDTO> cars;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDriverFrom() {
        return driverFrom;
    }

    public void setDriverFrom(Date driverFrom) {
        this.driverFrom = driverFrom;
    }

    public List<CarDTO> getCars() {
        return cars;
    }

    public void setCars(List<CarDTO> cars) {
        this.cars = cars;
    }

    public DriverDTO() {
    }

    public DriverDTO(Long id, String name, Date driverFrom, List<CarDTO> cars) {
        this.id = id;
        this.name = name;
        this.driverFrom = driverFrom;
        this.cars = cars;
    }
}
