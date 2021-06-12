package co.com.foodbank.address.dto;

import co.com.foodbank.country.dto.Country;

public interface IAddress {

    public Country getCountry();

    public String getDistrict();

    public String getPostalCode();

    public String getStreetNumber();

    public String getStreetName();

    public String getId();
}
