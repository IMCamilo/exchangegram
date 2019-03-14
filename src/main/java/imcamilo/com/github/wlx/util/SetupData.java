package imcamilo.com.github.wlx.util;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.dto.UserDTO;
import imcamilo.com.github.wlx.service.AlbumService;
import imcamilo.com.github.wlx.service.FetchDataService;
import imcamilo.com.github.wlx.service.PhotoService;
import imcamilo.com.github.wlx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Component
public class SetupData {

    private FetchDataService fetchDataService;
    private PhotoService photoService;
    private AlbumService albumService;
    private UserService userService;

    @Autowired
    public SetupData(FetchDataService fetchDataService, PhotoService photoService,
                     AlbumService albumService, UserService userService) {
        this.fetchDataService = fetchDataService;
        this.photoService = photoService;
        this.albumService = albumService;
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        List<UserDTO> users = fetchDataService.getAllUsers();
        userService.saveAllUsers(users);
        List<AlbumDTO> albums = fetchDataService.getAllAlbums();
        albumService.saveAllAlbums(albums);
        List<PhotoDTO> photos = fetchDataService.getAllPhotos();
        photoService.saveAllPhotos(photos);
    }

}
