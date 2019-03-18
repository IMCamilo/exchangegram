package imcamilo.com.github.wlx.controller

import imcamilo.com.github.wlx.dto.ExchangegramSimpleDTO
import imcamilo.com.github.wlx.dto.PermissionEnum
import imcamilo.com.github.wlx.service.ExchangegramService
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class AlbumControllerTest extends Specification {

    AlbumController albumController
    def exchangegramService = Stub(ExchangegramService)

    void setup() {
        albumController = new AlbumController(exchangegramService)
    }

    void "get detail for album should return List"() {
        given:
            def albumId = 1
            PermissionEnum permissionEnum = "READ"
            List<ExchangegramSimpleDTO> listESD = []
            exchangegramService.findAllByPermissionAndAlbumId(_ as Integer, _ as PermissionEnum) >> listESD
        when:
            def newResponse = albumController.getDetailsForAlbum(albumId, permissionEnum)
        then:
            newResponse instanceof List<ExchangegramSimpleDTO>
    }

}
