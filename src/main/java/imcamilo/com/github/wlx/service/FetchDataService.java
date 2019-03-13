package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.dto.UserDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface FetchDataService {

    List<UserDTO> getAllUsers();

    List<AlbumDTO> getAllAlbums();

    List<PhotoDTO> getAllPhotos();

}
