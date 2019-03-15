package imcamilo.com.github.wlx.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

}
