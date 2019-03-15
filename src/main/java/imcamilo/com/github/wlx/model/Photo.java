package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.PhotoDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
public class Photo implements Serializable {

    private Integer id;
    private Integer albumId;
    private String title;
    private String url;
    private String thumbnailUrl;

    public PhotoDTO toDTO() {
        PhotoDTO photoDTO = new PhotoDTO();
        photoDTO.setId(this.getId());
        photoDTO.setAlbumId(this.getAlbumId());
        photoDTO.setTitle(this.getTitle());
        photoDTO.setUrl(this.getUrl());
        photoDTO.setThumbnailUrl(this.getThumbnailUrl());
        return photoDTO;
    }

}
