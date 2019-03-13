package imcamilo.com.github.wlx.repository;

import imcamilo.com.github.wlx.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface PhotoRepository extends MongoRepository<Photo, String> {

}