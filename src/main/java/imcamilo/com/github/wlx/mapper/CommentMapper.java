package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.Comment;
import imcamilo.com.github.wlx.model.CommentPlus;
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

    @Insert("insert into comment (id, postId, name, email, body) " +
            "values (#{id}, #{postId}, #{name}, #{email}, #{body})")
    void save(@Param("id") Integer id, @Param("postId") Integer postId,
              @Param("name") String name, @Param("email") String email, @Param("body") String body);

    @Select("select * from comment where name like #{name} || '%'")
    List<Comment> findAllByName(@Param("name") String name);

    @Select("select p.userId, p.title, c.postId, c.name, c.email, c.body " +
            "from comment c join post p on c.postId = p.id where userId = #{userId}")
    List<CommentPlus> findAllByUserId(@Param("userId") Integer userId);

}
