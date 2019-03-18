package imcamilo.com.github.wlx.controller

import imcamilo.com.github.wlx.dto.ExchangegramDTO
import imcamilo.com.github.wlx.service.ExchangegramService
import org.springframework.http.ResponseEntity
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class ExchangegramControllerTest extends Specification {

    ExchangegramController exchangegramController
    def exchangegramService = Stub(ExchangegramService)

    void setup() {
        exchangegramController = new ExchangegramController(exchangegramService)
    }

    void "Find shared all albums (exchangegram) should return List"() {
        given:
            List<ExchangegramDTO> listSharedAlbums = []
            exchangegramService.findAll() >> listSharedAlbums
        when:
            def newResponse = exchangegramController.findAllSharedAlbums()
        then:
            newResponse instanceof List<ExchangegramDTO>
    }

    void "Register album for sharing"() {
        given:
            def exchangegramDTO = new ExchangegramDTO()
            exchangegramService.save(_ as ExchangegramDTO) >> null
        when:
            def newResponse = exchangegramController.registerAlbum(exchangegramDTO)
        then:
            newResponse instanceof ResponseEntity
            newResponse.body instanceof String
    }


    void "Update shared album"() {
        given:
            def exchangegramDTO = new ExchangegramDTO()
            exchangegramService.update(_ as ExchangegramDTO) >> null
        when:
            def newResponse = exchangegramController.updateRecordAlbum(exchangegramDTO)
        then:
            newResponse instanceof ResponseEntity
            newResponse.body instanceof String
    }

}
