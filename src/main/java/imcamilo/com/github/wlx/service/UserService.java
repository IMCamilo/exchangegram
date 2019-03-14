package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.UserDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface UserService {

    void saveUser(UserDTO userDTO);

    void saveAllUsers(List<UserDTO> userDTOList);

}
