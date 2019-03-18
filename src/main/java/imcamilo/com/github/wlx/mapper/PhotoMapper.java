package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.Photo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/15/19
 */
@Mapper
public interface PhotoMapper {

    @Insert("insert into photo (id, albumId, title, url, thumbnailUrl) " +
            "values (#{id}, #{albumId}, #{title}, #{url}, #{thumbnailUrl})")
    void save(@Param("id") Integer id,
                    @Param("albumId") Integer albumId,
                    @Param("title") String title,
                    @Param("url") String url,
                    @Param("thumbnailUrl") String thumbnailUrl);

    @Select("select p.id, p.albumId, p.title, p.url, a.userId, p.thumbnailurl " +
            "from album a join photo p on a.id = p.albumId " +
            "where a.userId = #{userId}")
    List<Photo> findAllPhotosByUserId(@Param("userId") Integer userId);

}
