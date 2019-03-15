package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.dto.CompanyDTO;
import imcamilo.com.github.wlx.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/15/19
 */
@Mapper
public interface ExchangegramMapper {

    @Insert("insert into exchangegram (id, name, username, email, address, phone, website, company) " +
            "values (#{id}, #{name}, #{username}, #{email}, #{address}, #{phone}, #{website}, #{company})")
    void save(@Param("id") Integer id,
                    @Param("name") String name,
                    @Param("username") String username,
                    @Param("company") CompanyDTO company);

    @Select("select * from users")
    List<User> findAll();

}
