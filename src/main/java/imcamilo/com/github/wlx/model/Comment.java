package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.CommentDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Getter
@Setter
public class Comment implements Serializable {

    private Integer id;
    private Integer postId;
    private String name;
    private String email;
    private String body;

    public CommentDTO toDTO() {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(this.getId());
        commentDTO.setPostId(this.getPostId());
        commentDTO.setName(this.getName());
        commentDTO.setEmail(this.getEmail());
        commentDTO.setBody(this.getBody());
        return commentDTO;
    }

}
