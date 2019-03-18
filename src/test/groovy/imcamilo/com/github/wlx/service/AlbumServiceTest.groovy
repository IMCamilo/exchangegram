package imcamilo.com.github.wlx.service

import imcamilo.com.github.wlx.dto.AlbumDTO
import imcamilo.com.github.wlx.mapper.AlbumMapper
import imcamilo.com.github.wlx.model.Album
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class AlbumServiceTest extends Specification {

    AlbumServiceImp service
    AlbumMapper mapper = Stub(AlbumMapper)

    void setup() {
        service = new AlbumServiceImp(mapper)
    }

    void "It must be void when the saved data is correct"() {
        given:
            def dataSaved = void
            List<AlbumDTO> albumDTOS = []
            mapper.save(_,_,_) >> dataSaved
        when:
            def albumsSave = service.saveAllAlbums(albumDTOS)
        then:
            albumsSave == null
    }

    void "Should return List<AlbumDTO> when the find data is correct"() {
        given:
            Integer userId = 3
            List<Album> dataSearch = []
            mapper.findAllByUserId(_) >> dataSearch
        when:
            def findInformation = service.findAllByUserId(userId)
        then:
            findInformation instanceof List<AlbumDTO>
    }

}
