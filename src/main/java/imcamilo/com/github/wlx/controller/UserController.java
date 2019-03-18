package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.service.AlbumService;
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

    @Autowired
    public UserController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/{id}/albums")
    public @ResponseBody List<AlbumDTO> getAlbumList(@PathVariable Integer id) {
        return albumService.findAllByUserId(id);
    }

    @GetMapping("/{id}/photos")
    public @ResponseBody List<AlbumDTO> getPhotoList(@PathVariable Integer id) {
        return null;
    }

}
