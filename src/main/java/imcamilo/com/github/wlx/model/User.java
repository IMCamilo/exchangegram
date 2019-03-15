package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.AddressDTO;
import imcamilo.com.github.wlx.dto.CompanyDTO;
import imcamilo.com.github.wlx.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
public class User implements Serializable {

    private Integer id;
    private String name;
    private String username;
    private String email;
    //private AddressDTO address;
    private String phone;
    private String website;
    //private CompanyDTO company;

    public UserDTO toDTO() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(this.getId());
        userDTO.setName(this.getName());
        userDTO.setUsername(this.getUsername());
        userDTO.setEmail(this.getEmail());
        //userDTO.setAddress(this.getAddress());
        userDTO.setPhone(this.getPhone());
        userDTO.setWebsite(this.getWebsite());
        //userDTO.setCompany(this.getCompany());
        return userDTO;
    }

}
