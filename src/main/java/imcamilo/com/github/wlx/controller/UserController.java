package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.service.AlbumService;
import imcamilo.com.github.wlx.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private AlbumService albumService;
    private PhotoService photoService;

    @Autowired
    public UserController(AlbumService albumService, PhotoService photoService) {
        this.albumService = albumService;
        this.photoService = photoService;
    }

    @GetMapping("/{id}/albums")
    public @ResponseBody List<AlbumDTO> getAlbumList(@PathVariable Integer id) {
        return albumService.findAllByUserId(id);
    }

    @GetMapping("/{id}/photos")
    public @ResponseBody List<PhotoDTO> getPhotoList(@PathVariable Integer id) {
        return photoService.findAllPhotosByUserId(id);
    }

}
