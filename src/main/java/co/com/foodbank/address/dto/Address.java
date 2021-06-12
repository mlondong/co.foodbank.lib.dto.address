package co.com.foodbank.address.dto;

import co.com.foodbank.country.dto.Country;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.address.dto 16/05/2021
 */
public class Address implements IAddress {


    public String id;
    public String streetName;
    public String streetNumber;
    public String postalCode;
    public String district;
    public Country country;

    public Address() {

    }

    public Address(String id, String streetName, String streetNumber,
            String postalCode, String district, Country country) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.district = district;
        this.country = country;
    }



    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", streetName=" + streetName
                + ", streetNumber=" + streetNumber + ", postalCode="
                + postalCode + ", district=" + district + ", country=" + country
                + "]";
    }



}
