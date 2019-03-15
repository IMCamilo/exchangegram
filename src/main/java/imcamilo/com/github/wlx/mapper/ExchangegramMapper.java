package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.Exchangegram;
import imcamilo.com.github.wlx.model.ExchangegramSimple;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/15/19
 */
@Mapper
public interface ExchangegramMapper {

    @Insert("insert into exchangegram (albumId, ownerId, friendId, permission) " +
            "values (#{albumId}, #{ownerId}, #{friendId}, #{permission})")
    void save(@Param("albumId") Integer albumId, @Param("ownerId") Integer ownerId,
              @Param("friendId") Integer friendId, @Param("permission") String permission);

    @Update("update exchangegram set permission=#{permission} where id = #{id}")
    void updatePermission(@Param("permission") String permission,
                          @Param("id") Integer id);

    @Select("select * from exchangegram")
    List<Exchangegram> findAll();

    @Select("select u.name, u.email, x.albumId, x.permission" +
            "from exchangegram as x join users as u on x.friendId = u.id" +
            "where x.albumId = #{albumId} and x.permission = #{permission}")
    List<ExchangegramSimple> findAllByAlbumIdAndPermission(@Param("albumId") Integer albumId, @Param("permission") String permission);

}
