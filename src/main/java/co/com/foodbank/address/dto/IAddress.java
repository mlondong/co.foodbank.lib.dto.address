package co.com.foodbank.address.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import co.com.foodbank.country.dto.Country;

public interface IAddress {

    public Country getCountry();

    public String getDistrict();

    public String getPostalCode();

    public String getStreetNumber();

    public String getStreetName();

    @JsonIgnore(value = true)
    public String getId();
}
