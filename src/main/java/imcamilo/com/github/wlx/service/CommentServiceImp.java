package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.CommentDTO;
import imcamilo.com.github.wlx.mapper.CommentMapper;
import imcamilo.com.github.wlx.model.Comment;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Service
public class CommentServiceImp implements CommentService{

    private CommentMapper commentMapper;

    @Autowired
    public CommentServiceImp(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public void saveAllComments(List<CommentDTO> commentDTOList) {
        List<Comment> postList = commentDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        postList.forEach( comment ->
                commentMapper.save(comment.getId(), comment.getPostId(),
                        comment.getName(), comment.getEmail(),
                        comment.getTitle(), comment.getBody()));
    }

    public List<CommentDTO> findAllByName(String name) {
        List<Comment> comments = commentMapper.findAllByName(name);
        return comments.stream().map(Comment::toDTO).collect(Collectors.toList());
    }

    public List<CommentDTO> findAllByUserId(Integer userId) {
        List<Comment> comments = commentMapper.findAllByUserId(userId);
        return comments.stream().map(Comment::toDTO).collect(Collectors.toList());
    }

}
