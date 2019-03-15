package imcamilo.com.github.wlx.repository;

import imcamilo.com.github.wlx.dto.PermissionEnum;
import imcamilo.com.github.wlx.model.Exchangegram;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
public interface ExchangegramRepository extends MongoRepository<Exchangegram, String> {

    List<Exchangegram> findAllByPermissionAndAlbumId(PermissionEnum permissionEnum, Integer albumId);

}