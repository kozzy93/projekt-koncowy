package pl.edu.wszib.projektkoncowy.model;

import javax.validation.constraints.Size;
import java.util.Objects;

public class OrderAddressModel {

    @Size(min = 2, max = 25)
    private String firstName;
    @Size(min = 2, max = 25)
    private String lastName;
    @Size(min = 2, max = 30)
    private String street;
    @Size(min = 6, max = 6)
    private String postalCode;
    @Size(min = 2, max = 25)
    private String city;
    @Size(min = 11, max = 11)
    private String phoneNumber;
    @Size(min = 10, max = 10)
    private String visitingDate;

    private String visitingTime;

    private String guide;

    private String monumentOrder;

    private Integer orderId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderAddressModel that = (OrderAddressModel) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(street, that.street) && Objects.equals(postalCode, that.postalCode) && Objects.equals(city, that.city) && Objects.equals(guide, that.guide) && Objects.equals(monumentOrder, that.monumentOrder) && Objects.equals(visitingDate, that.visitingDate) && Objects.equals(visitingTime, that.visitingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, street, postalCode, city, guide, monumentOrder, visitingDate, visitingTime);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVisitingDate() {
        return visitingDate;
    }

    public void setVisitingDate(String visitingDate) {
        this.visitingDate = visitingDate;
    }

    public String getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(String visitingTime) {
        this.visitingTime = visitingTime;
    }

    public String getMonumentOrder() {
        return monumentOrder;
    }

    public void setMonumentOrder(String monumentOrder) {
        this.monumentOrder = monumentOrder;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
