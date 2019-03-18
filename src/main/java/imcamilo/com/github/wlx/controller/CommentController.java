package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.CommentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    @GetMapping("/name/{name}")
    public List<CommentDTO> getByName(@PathVariable String name) {
        return null;
    }

    @GetMapping("/users/{userId}")
    public List<CommentDTO> getByUser(@PathVariable String userId) {
        return null;
    }

}
