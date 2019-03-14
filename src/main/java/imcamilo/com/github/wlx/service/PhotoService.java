package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.PhotoDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface PhotoService {

    void savePhoto(PhotoDTO photoDTO);

    void saveAllPhotos(List<PhotoDTO> photoDTOList);

}
