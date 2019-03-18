package imcamilo.com.github.wlx.controller

import imcamilo.com.github.wlx.dto.CommentDTO
import imcamilo.com.github.wlx.dto.CommentPlusDTO
import imcamilo.com.github.wlx.service.CommentService
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class CommentControllerTest extends Specification {

    CommentController commentController
    def commentService = Stub(CommentService)

    void setup() {
        commentController = new CommentController(commentService)
    }

    void "Find comments by userId should return List"() {
        given:
            def userId = 1
            List<CommentPlusDTO> listComments = []
            commentService.findAllByUserId(_ as Integer) >> listComments
        when:
            def newResponse = commentController.getByUser(userId)
        then:
            newResponse instanceof List<CommentPlusDTO>
    }

    void "Find comments by name should return List"() {
        given:
            def userId = "lorem"
            List<CommentDTO> listComments = []
            commentService.findAllByName(_ as String) >> listComments
        when:
            def newResponse = commentController.getByName(userId)
        then:
            newResponse instanceof List<CommentDTO>
    }

}
