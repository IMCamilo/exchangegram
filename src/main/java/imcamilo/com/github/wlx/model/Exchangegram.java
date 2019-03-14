package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.PermissionEnum;
import imcamilo.com.github.wlx.dto.ExchangegramDTO;
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
public class Exchangegram {

    @Id
    private String id;
    private Integer albumId;
    private Integer ownerId;
    private Integer friendId;
    private PermissionEnum permission;

    public ExchangegramDTO toDTO() {
        ExchangegramDTO exchangegramDTO = new ExchangegramDTO();
        exchangegramDTO.setAlbumId(this.getAlbumId());
        exchangegramDTO.setOwnerId(this.getOwnerId());
        exchangegramDTO.setFriendId(this.getFriendId());
        exchangegramDTO.setPermission(this.getPermission());
        return exchangegramDTO;
    }

}
