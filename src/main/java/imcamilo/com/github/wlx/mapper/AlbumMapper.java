package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.Album;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/15/19
 */
@Mapper
public interface AlbumMapper {

    @Insert("insert into album (id, userId, title) values (#{id}, #{userId}, #{title})")
    void save(@Param("id") Integer id, @Param("userId") Integer userId, @Param("title") String title);

    @Select("select * from album where userId = #{userId}")
    List<Album> findAllByUserId(@Param("userId") Integer userId);

}
