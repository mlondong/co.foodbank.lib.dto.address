package co.com.foodbank.address.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnore;
import co.com.foodbank.country.dto.Country;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.address.interfaces
 *         11/08/2021
 */
public interface IAddress {

    public Country getCountry();

    public String getDistrict();

    public String getPostalCode();

    public String getStreetNumber();

    public String getStreetName();

    @JsonIgnore(value = true)
    public String getId();
}
