package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.AddressDTO;
import imcamilo.com.github.wlx.dto.CompanyDTO;
import imcamilo.com.github.wlx.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
@Document
public class User {

    @Id
    private String id;
    private Integer idSource;
    private String name;
    private String username;
    private String email;
    private AddressDTO address;
    private String phone;
    private String website;
    private CompanyDTO company;

    public UserDTO toDTO() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(this.getIdSource());
        userDTO.setName(this.getName());
        userDTO.setUsername(this.getUsername());
        userDTO.setEmail(this.getEmail());
        userDTO.setAddress(this.getAddress());
        userDTO.setPhone(this.getPhone());
        userDTO.setWebsite(this.getWebsite());
        userDTO.setCompany(this.getCompany());
        return userDTO;
    }

}
