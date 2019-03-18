package imcamilo.com.github.wlx.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Getter
@Setter
public class CommentDTO {

    private Integer id;
    private Integer postId;
    private String name;
    private String email;
    private String title;
    private String body;

}
