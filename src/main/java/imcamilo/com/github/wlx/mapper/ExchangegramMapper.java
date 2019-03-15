package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.Exchangegram;
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

    //get all users for album with the same permission

}
