package pl.edu.wszib.projektkoncowy.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Monuments")
public class MonumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer visitingTime;
    @OneToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(Integer visitingTime) {
        this.visitingTime = visitingTime;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }
}
