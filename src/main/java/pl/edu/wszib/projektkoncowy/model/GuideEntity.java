package pl.edu.wszib.projektkoncowy.model;

import javax.persistence.*;

@Entity
@Table(name = "Guides")
public class GuideEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String language;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }
}
