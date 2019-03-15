package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.service.ExchangegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
@RestController
@RequestMapping("/api/v1/exchangegram")
public class ExchangegramController {

    @Autowired
    private ExchangegramService exchangegramService;

    @PostMapping
    public void registerAlbum(@RequestBody ExchangegramDTO exchangegramDTO) {
        exchangegramService.save(exchangegramDTO);
    }

    @PutMapping
    public void updateRecordAlbum(@RequestBody ExchangegramDTO exchangegramDTO) {
        exchangegramService.update(exchangegramDTO);
    }

}
