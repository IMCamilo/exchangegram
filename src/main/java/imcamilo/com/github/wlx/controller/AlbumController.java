package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@RestController
@RequestMapping("/api/v1/albums")
public class AlbumController {

    @GetMapping("/{id}")
    public AlbumDTO getAlbum(@PathVariable Integer id) {
        return null;
    }

}
