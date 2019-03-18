package imcamilo.com.github.wlx.controller;

import imcamilo.com.github.wlx.dto.CommentDTO;
import imcamilo.com.github.wlx.dto.CommentPlusDTO;
import imcamilo.com.github.wlx.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
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

    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/name/{name}")
    public List<CommentDTO> getByName(@PathVariable String name) {
        return commentService.findAllByName(name);
    }

    @GetMapping("/users/{userId}")
    public List<CommentPlusDTO> getByUser(@PathVariable Integer userId) {
        return commentService.findAllByUserId(userId);
    }

}
