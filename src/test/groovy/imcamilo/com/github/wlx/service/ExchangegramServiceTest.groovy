package imcamilo.com.github.wlx.service

import imcamilo.com.github.wlx.dto.ExchangegramDTO
import imcamilo.com.github.wlx.dto.ExchangegramSimpleDTO
import imcamilo.com.github.wlx.dto.PermissionEnum
import imcamilo.com.github.wlx.mapper.ExchangegramMapper
import imcamilo.com.github.wlx.model.ExchangegramSimple
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class ExchangegramServiceTest extends Specification {

    ExchangegramServiceImp service
    ExchangegramMapper mapper = Stub(ExchangegramMapper)

    void setup() {
        service = new ExchangegramServiceImp(mapper)
    }

    void "It must be void when the data is saved"() {
        given:
            def dataSaved
            def exchangegramDTO = new ExchangegramDTO()
            exchangegramDTO.albumId = 1
            exchangegramDTO.ownerId = 1
            exchangegramDTO.friendId = 1
            exchangegramDTO.permission = "ALL"
            mapper.save(_,_,_,_) >> dataSaved
        when:
            def exchSave = service.save(exchangegramDTO)
        then:
            exchSave == null
    }

    void "It must be void when the data is updated"() {
        given:
            def dataSaved
            def exchangegramDTO = new ExchangegramDTO()
            exchangegramDTO.albumId = 1
            exchangegramDTO.ownerId = 1
            exchangegramDTO.friendId = 1
            exchangegramDTO.permission = "ALL"
            mapper.updatePermission(_,_) >> dataSaved
        when:
            def exchSave = service.update(exchangegramDTO)
        then:
            exchSave == null
    }

    void "Should return List<ExchangegramSimpleDTO> when the find data are correct"() {
        given:
            Integer albumId = 1
            PermissionEnum permission = "ALL"
            List<ExchangegramSimpleDTO> dataSearch = []
            mapper.findAllByAlbumIdAndPermission(_,_) >> dataSearch
        when:
            def findInformation = service.findAllByPermissionAndAlbumId(albumId, permission)
        then:
            findInformation instanceof List<ExchangegramSimple>
    }

    void "Should return List<ExchangegramSimpleDTO> when the findAll is correct"() {
        given:
            List<ExchangegramSimpleDTO> dataSearch = []
            mapper.findAll() >> dataSearch
        when:
            def findInformation = service.findAll()
        then:
            findInformation instanceof List<ExchangegramSimple>
    }

}
