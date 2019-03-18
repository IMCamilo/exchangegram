package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.mapper.PhotoMapper;
import imcamilo.com.github.wlx.model.Photo;
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

    private PhotoMapper photoMapper;

    @Autowired
    public PhotoServiceImp(PhotoMapper photoMapper) {
        this.photoMapper = photoMapper;
    }

    public void saveAllPhotos(List<PhotoDTO> photoDTOList) {
        List<Photo> photoList = photoDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        photoList.forEach( photo ->
                photoMapper.save(photo.getId(), photo.getAlbumId(), photo.getTitle(), photo.getUrl(), photo.getThumbnailUrl()));
    }

    public List<PhotoDTO> findAllPhotosByUserId(Integer userId) {
        List<Photo> photosByUserId = photoMapper.findAllPhotosByUserId(userId);
        return photosByUserId.stream().map(Photo::toDTO).collect(Collectors.toList());
    }

}
