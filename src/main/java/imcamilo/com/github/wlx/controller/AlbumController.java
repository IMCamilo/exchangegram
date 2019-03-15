package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.PermissionEnum;
import imcamilo.com.github.wlx.service.ExchangegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Camilo Jorquera on 3/15/19
 */
@RestController
@RequestMapping("/api/v1/albums")
public class AlbumController {

    @Autowired
    private ExchangegramService exchangegramService;

    @GetMapping("/{id}/permissions/{permission}")
    public void getDetailsForAlbum(@PathVariable Integer id, @PathVariable PermissionEnum permission) {
        //exchangegramService.findAllByPermissionAndAlbumId(permission, id);
    }

}
