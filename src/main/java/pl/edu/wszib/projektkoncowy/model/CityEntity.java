package pl.edu.wszib.projektkoncowy.model;

import javax.persistence.*;

@Entity
@Table(name = "Cities")
public class CityEntity {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "city_name")
    private String cityName;

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
