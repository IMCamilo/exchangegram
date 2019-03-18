package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Mapper
public interface CommentMapper {

    @Insert("insert into comment (id, postId, name, email, title, body) " +
            "values (#{id}, #{postId}, #{name}, #{email}, #{title}, #{body})")
    void save(@Param("id") Integer id, @Param("postId") Integer postId,
              @Param("name") String name, @Param("email") String email,
              @Param("title") String title, @Param("body") String body);

    @Select("select * from comment where name= #{name}")
    List<Comment> findAllByName(@Param("name") String name);

    @Select("select * from comment where userId= #{userId}")
    List<Comment> findAllByUserId(@Param("userId") Integer userId);

}
