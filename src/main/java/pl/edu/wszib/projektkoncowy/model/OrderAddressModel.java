package pl.edu.wszib.projektkoncowy.model;

public class OrderAddressModel {

    private String firstName;

    private String lastName;

    private String street;

    private String postalCode;

    private String city;

    private String guide;

    private String monumentOrder;

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
}
