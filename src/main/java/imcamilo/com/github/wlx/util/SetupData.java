package imcamilo.com.github.wlx.util;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.dto.UserDTO;
import imcamilo.com.github.wlx.service.FetchDataService;
import imcamilo.com.github.wlx.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Component
public class SetupData {

    @Autowired
    private FetchDataService fetchDataService;

    @Autowired
    private StorageService storageService;

    @PostConstruct
    public void init() {
        List<UserDTO> users = fetchDataService.getAllUsers();
        storageService.saveAllUsers(users);
        List<AlbumDTO> albums = fetchDataService.getAllAlbums();
        storageService.saveAllAlbums(albums);
        List<PhotoDTO> photos = fetchDataService.getAllPhotos();
        storageService.saveAllPhotos(photos);
    }

}
