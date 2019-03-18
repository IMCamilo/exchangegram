package imcamilo.com.github.wlx.service

import imcamilo.com.github.wlx.dto.CommentDTO
import imcamilo.com.github.wlx.dto.CommentPlusDTO
import imcamilo.com.github.wlx.mapper.CommentMapper
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class CommentServiceTest extends Specification {

    CommentServiceImp service
    CommentMapper mapper = Stub(CommentMapper)

    void setup() {
        service = new CommentServiceImp(mapper)
    }

    void "It must be void when the saved data is correct"() {
        given:
            def dataSaved = void
            List<CommentDTO> commentDTOS = []
            mapper.save(_,_,_,_,_) >> dataSaved
        when:
            def commentSave = service.saveAllComments(commentDTOS)
        then:
            commentSave == null
    }

    void "Should return List<CommentDTO> when the find data are correct"() {
        given:
            String name = "Me"
            List<CommentDTO> dataSearch = []
            mapper.findAllByName(_) >> dataSearch
        when:
            def findInformation = service.findAllByName(name)
        then:
            findInformation instanceof List<CommentDTO>
    }

    void "Should return List<CommentPlusDTO> when the findAll is correct"() {
        given:
            Integer userId = 2
            List<CommentPlusDTO> dataSearch = []
            mapper.findAllByUserId(_) >> dataSearch
        when:
            def findInformation = service.findAllByUserId(userId)
        then:
            findInformation instanceof List<CommentPlusDTO>
    }

}
