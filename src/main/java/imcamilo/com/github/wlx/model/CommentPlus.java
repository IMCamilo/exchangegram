package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.CommentPlusDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Getter
@Setter
public class CommentPlus extends Comment {

    private Integer userId;

    public CommentPlusDTO toDTO() {
        CommentPlusDTO plusDTO = new CommentPlusDTO();
        plusDTO.setId(this.getId());
        plusDTO.setUserId(this.getUserId());
        plusDTO.setPostId(this.getPostId());
        plusDTO.setName(this.getName());
        plusDTO.setEmail(this.getEmail());
        plusDTO.setBody(this.getBody());
        return plusDTO;
    }

}
