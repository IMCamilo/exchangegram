package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.UserDTO;
import imcamilo.com.github.wlx.model.User;
import imcamilo.com.github.wlx.repository.UserRepository;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserDTO userDTO) {
        userRepository.deleteAll();
        userRepository.save(DTOMapper.toEntity(userDTO));
    }

    public void saveAllUsers(List<UserDTO> userDTOList) {
        userRepository.deleteAll();
        List<User> userList = userDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        userRepository.saveAll(userList);
    }

}
