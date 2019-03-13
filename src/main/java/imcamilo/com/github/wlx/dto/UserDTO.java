package imcamilo.com.github.wlx.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
public class UserDTO {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private AddressDTO address;
    private String phone;
    private String website;
    private CompanyDTO company;

}
