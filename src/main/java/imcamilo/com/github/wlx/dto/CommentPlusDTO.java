package imcamilo.com.github.wlx.dto;

import imcamilo.com.github.wlx.model.Comment;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Getter
@Setter
public class CommentPlusDTO extends CommentDTO {

    private Integer userId;

}
