package co.com.foodbank.address.dto;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import co.com.foodbank.country.dto.CountryDTO;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.address.dto 19/05/2021
 */
public class AddressDTO {

    @Size(min = 3, max = 10,
            message = "Wrong definition for Street name in address.")
    public String streetName;

    @Size(min = 3, max = 10,
            message = "Wrong definition for Street number in address.")
    public String streetNumber;

    @Size(min = 3, max = 5,
            message = "Wrong definition for postal code in address.")
    public String postalCode;

    @Size(min = 3, max = 10,
            message = "Wrong definition for district in address.")
    public String district;

    @Valid
    public CountryDTO country;



    public AddressDTO() {}


    public AddressDTO(String streetName, String streetNumber, String postalCode,
            String district, CountryDTO country) {
        super();
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.district = district;
        this.country = country;
    }



    public String getStreetName() {
        return streetName;
    }


    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


    public String getStreetNumber() {
        return streetNumber;
    }


    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }


    public String getPostalCode() {
        return postalCode;
    }


    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getDistrict() {
        return district;
    }


    public void setDistrict(String district) {
        this.district = district;
    }


    public CountryDTO getCountry() {
        return country;
    }


    public void setCountry(CountryDTO country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "AddressDTO [streetName=" + streetName + ", streetNumber="
                + streetNumber + ", postalCode=" + postalCode + ", district="
                + district + ", country=" + country + "]";
    }



}
