package imcamilo.com.github.wlx.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Mapper
public interface PostMapper {

    @Insert("insert into post (id, userId, title, body) values (#{id}, #{userId}, #{title}, #{body})")
    void save(@Param("id") Integer id, @Param("userId") Integer userId,
              @Param("title") String title, @Param("body") String body);

}
