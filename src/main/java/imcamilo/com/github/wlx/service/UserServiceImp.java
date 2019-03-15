package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.UserDTO;
import imcamilo.com.github.wlx.mapper.UserMapper;
import imcamilo.com.github.wlx.model.User;
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

    private UserMapper userMapper;

    @Autowired
    public UserServiceImp(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void saveAllUsers(List<UserDTO> userDTOList) {
        List<User> userList = userDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        userList.forEach(user -> userMapper.save(
                user.getId(), user.getName(), user.getUsername(), user.getEmail(),
                "", user.getPhone(), user.getWebsite(), ""));
    }

}
