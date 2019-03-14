package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.model.Photo;
import imcamilo.com.github.wlx.repository.PhotoRepository;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Service
public class PhotoServiceImp implements PhotoService {

    private PhotoRepository photoRepository;

    @Autowired
    public PhotoServiceImp(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public void savePhoto(PhotoDTO photoDTO) {
        photoRepository.deleteAll();
        photoRepository.save(DTOMapper.toEntity(photoDTO));
    }

    public void saveAllPhotos(List<PhotoDTO> photoDTOList) {
        photoRepository.deleteAll();
        List<Photo> photoList = photoDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        photoRepository.saveAll(photoList);
    }

}
