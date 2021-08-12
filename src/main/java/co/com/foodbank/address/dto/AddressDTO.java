package co.com.foodbank.address.dto;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import co.com.foodbank.country.dto.CountryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.address.dto 19/05/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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


}
