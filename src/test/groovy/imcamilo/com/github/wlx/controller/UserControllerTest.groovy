package imcamilo.com.github.wlx.controller

import imcamilo.com.github.wlx.dto.AlbumDTO
import imcamilo.com.github.wlx.service.AlbumService
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class UserControllerTest extends Specification {

    UserController commentController
    def albumService = Stub(AlbumService)

    void setup() {
        commentController = new UserController(albumService)
    }

    void "Find user's albums should return List"() {
        given:
            def userId = 1
            List<AlbumDTO> listAlbums = []
            albumService.findAllByUserId(_ as Integer) >> listAlbums
        when:
            def newResponse = commentController.getAlbumList(userId)
        then:
            newResponse instanceof List<AlbumDTO>
    }

}
