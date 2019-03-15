package imcamilo.com.github.wlx.mapper;

import imcamilo.com.github.wlx.model.Exchangegram;
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

    @Insert("insert into exchangegram (albumId, ownerId, friendId, permission) " +
            "values (#{albumId}, #{ownerId}, #{friendId}, #{permission})")
    void save(@Param("albumId") Integer albumId, @Param("ownerId") Integer ownerId,
                    @Param("friendId") Integer friendId, @Param("permission") String permission);

    @Select("select * from exchangegram")
    List<Exchangegram> findAll();

}
