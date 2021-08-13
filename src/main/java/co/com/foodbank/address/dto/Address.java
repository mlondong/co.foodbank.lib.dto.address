package co.com.foodbank.address.dto;

import co.com.foodbank.address.dto.interfaces.IAddress;
import co.com.foodbank.country.dto.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.address.dto 16/05/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements IAddress {


    public String id;

    public String streetName;
    public String streetNumber;
    public String postalCode;
    public String district;
    public Country country;


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getStreetName() {
        return streetName;
    }

    @Override
    public String getStreetNumber() {
        return streetNumber;
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String getDistrict() {
        return district;
    }


    @Override
    public Country getCountry() {
        return country;
    }



}
