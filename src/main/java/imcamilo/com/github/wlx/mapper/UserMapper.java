package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/15/19
 */
@Mapper
public interface UserMapper {

    @Insert("insert into users (id, name, username, email, address, phone, website, company) " +
            "values (#{id}, #{name}, #{username}, #{email}, #{address}, #{phone}, #{website}, #{company})")
    void save(@Param("id") Integer id,
              @Param("name") String name,
              @Param("username") String username,
              @Param("email") String email,
              @Param("address") String address,
              @Param("phone") String phone,
              @Param("website") String website,
              @Param("company") String company);

    @Select("select * from users")
    List<User> findAll();

}
