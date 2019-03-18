package imcamilo.com.github.wlx.service

import imcamilo.com.github.wlx.dto.PhotoDTO
import imcamilo.com.github.wlx.mapper.PhotoMapper
import imcamilo.com.github.wlx.model.Photo
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 3/18/19
 */
class PhotoServiceTest extends Specification {

    PhotoServiceImp service
    PhotoMapper mapper = Stub(PhotoMapper)

    void setup() {
        service = new PhotoServiceImp(mapper)
    }

    void "It must be void when the saved data is correct"() {
        given:
            def dataSaved = void
            List<PhotoDTO> photoDTOS = []
            mapper.save(_,_,_,_,_) >> dataSaved
        when:
            def photoSave = service.saveAllPhotos(photoDTOS)
        then:
            photoSave == null
    }

    void "Should return List<ExchangegramSimpleDTO> when the findAll is correct"() {
        given:
            List<Photo> dataSearch = []
            mapper.findAllPhotosByUserId() >> dataSearch
        when:
            def findInformation = service.findAllPhotosByUserId()
        then:
            findInformation instanceof List<PhotoDTO>
    }

}
