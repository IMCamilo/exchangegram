package imcamilo.com.github.wlx.controller

import imcamilo.com.github.wlx.dto.AlbumDTO
import imcamilo.com.github.wlx.dto.PhotoDTO
import imcamilo.com.github.wlx.service.AlbumService
import imcamilo.com.github.wlx.service.PhotoService
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class UserControllerTest extends Specification {

    UserController commentController
    def albumService = Stub(AlbumService)
    def photoService = Stub(PhotoService)

    void setup() {
        commentController = new UserController(albumService, photoService)
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

    void "Find user's photo should return List"() {
        given:
            def userId = 1
            List<PhotoDTO> photoList = []
            photoService.findAllPhotosByUserId(_ as Integer) >> photoList
        when:
            def newResponse = commentController.getPhotoList(userId)
        then:
            newResponse instanceof List<PhotoDTO>
    }

}
