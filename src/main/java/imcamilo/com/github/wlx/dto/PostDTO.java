package imcamilo.com.github.wlx.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Getter
@Setter
public class PostDTO {

    private Integer id;
    private Integer userId;
    private String title;
    private String body;

}
