package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
public class Album implements Serializable {

    private Integer id;
    private Integer userId;
    private String title;

    public AlbumDTO toDTO() {
        AlbumDTO albumDTO = new AlbumDTO();
        albumDTO.setId(this.getId());
        albumDTO.setUserId(this.getUserId());
        albumDTO.setTitle(this.getTitle());
        return albumDTO;
    }

}
