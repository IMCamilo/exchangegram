package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.PermissionEnum;
import imcamilo.com.github.wlx.dto.SharedContentDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
@Getter
@Setter
@Document
public class SharedContent {

    @Id
    private String id;
    private String albumId;
    private String ownerId;
    private String friendId;
    private PermissionEnum permission;

    public SharedContentDTO toDTO() {
        SharedContentDTO sharedContentDTO = new SharedContentDTO();
        sharedContentDTO.setId(this.getId());
        sharedContentDTO.setAlbumId(this.getAlbumId());
        sharedContentDTO.setOwnerId(this.getOwnerId());
        sharedContentDTO.setFriendId(this.getFriendId());
        sharedContentDTO.setPermission(this.getPermission());
        return sharedContentDTO;
    }

}
