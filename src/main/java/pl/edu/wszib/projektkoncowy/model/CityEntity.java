package pl.edu.wszib.projektkoncowy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cities")
public class CityEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String cityName;

    public CityEntity(Integer id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
