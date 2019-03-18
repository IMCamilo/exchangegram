package imcamilo.com.github.wlx.service

import imcamilo.com.github.wlx.dto.PostDTO
import imcamilo.com.github.wlx.mapper.PostMapper
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class PostServiceTest extends Specification {

    PostServiceImp service
    PostMapper mapper = Stub(PostMapper)

    void setup() {
        service = new PostServiceImp(mapper)
    }

    void "It must be void when the saved data is correct"() {
        given:
            def dataSaved = void
            List<PostDTO> posts = []
            mapper.save(_,_,_,_) >> dataSaved
        when:
            def userSaved = service.saveAllPosts(posts)
        then:
            userSaved == null
    }

}
