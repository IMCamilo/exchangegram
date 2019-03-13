package imcamilo.com.github.wlx.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
public class PhotoDTO {

    private Integer id;
    private Integer albumId;
    private String title;
    private String url;
    private String thumbnailUrl;

}
