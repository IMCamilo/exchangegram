package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.service.ExchangegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
@RestController
@RequestMapping("/api/v1/exchangegram")
public class ExchangegramController {

    private ExchangegramService exchangegramService;

    @Autowired
    public ExchangegramController(ExchangegramService exchangegramService) {
        this.exchangegramService = exchangegramService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity registerAlbum(@RequestBody ExchangegramDTO exchangegramDTO) {
        exchangegramService.save(exchangegramDTO);
        return ResponseEntity.ok("OK");
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity updateRecordAlbum(@RequestBody ExchangegramDTO exchangegramDTO) {
        exchangegramService.update(exchangegramDTO);
        return ResponseEntity.ok("OK");
    }

    @GetMapping
    public List<ExchangegramDTO> findAllSharedAlbums() {
        return exchangegramService.findAll();
    }

}
