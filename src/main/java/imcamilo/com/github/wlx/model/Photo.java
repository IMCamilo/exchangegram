package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.PhotoDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Getter
@Setter
@Document
public class Photo {

    @Id
    private String id;
    private Integer albumId;
    private Integer idSource;
    private String title;
    private String url;
    private String thumbnailUrl;

    public PhotoDTO toDTO() {
        PhotoDTO photoDTO = new PhotoDTO();
        photoDTO.setAlbumId(this.getAlbumId());
        photoDTO.setId(this.getIdSource());
        photoDTO.setTitle(this.getTitle());
        photoDTO.setUrl(this.getUrl());
        photoDTO.setThumbnailUrl(this.getThumbnailUrl());
        return photoDTO;
    }

}
