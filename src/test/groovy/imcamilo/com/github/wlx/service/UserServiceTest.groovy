package imcamilo.com.github.wlx.service

import imcamilo.com.github.wlx.dto.UserDTO
import imcamilo.com.github.wlx.mapper.UserMapper
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class UserServiceTest extends Specification {

    UserServiceImp service
    UserMapper mapper = Stub(UserMapper)

    void setup() {
        service = new UserServiceImp(mapper)
    }

    void "It must be void when the saved data is correct"() {
        given:
            def dataSaved = void
            List<UserDTO> users = []
            mapper.save(_) >> dataSaved
        when:
            def userSaved = service.saveAllUsers(users)
        then:
            userSaved == null
    }

}
