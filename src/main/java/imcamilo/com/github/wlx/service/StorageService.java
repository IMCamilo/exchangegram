package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.dto.UserDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface StorageService {

    void saveUser(UserDTO userDTO);

    void saveAllUsers(List<UserDTO> userDTOList);

    void saveAlbum(AlbumDTO albumDTO);

    void saveAllAlbums(List<AlbumDTO> albumDTOList);

    void savePhoto(PhotoDTO photoDTO);

    void saveAllPhotos(List<PhotoDTO> photoDTOList);

}
