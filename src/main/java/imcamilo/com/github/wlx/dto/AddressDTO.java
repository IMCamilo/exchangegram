package imcamilo.com.github.wlx.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
public class AddressDTO {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoDTO geoDTO;

}
