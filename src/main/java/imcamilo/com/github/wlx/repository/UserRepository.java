package imcamilo.com.github.wlx.repository;

import imcamilo.com.github.wlx.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface UserRepository extends MongoRepository<User, String> {

}