package road.accident.driverservice.roadaccidentdriver.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;

import java.util.Date;

public class CarDTO {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String tagNumber;

    @NotNull
    private Integer horsePoints;

    public CarDTO(Long id, String name, String tagNumber, Integer horsePoints) {
        this.id = id;
        this.name = name;
        this.tagNumber = tagNumber;
        this.horsePoints = horsePoints;
    }

    public CarDTO() {
    }

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

    public String getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    public Integer getHorsePoints() {
        return horsePoints;
    }

    public void setHorsePoints(Integer horsePoints) {
        this.horsePoints = horsePoints;
    }
}
