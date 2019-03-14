package imcamilo.com.github.wlx.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
@Getter
@Setter
public class ExchangegramDTO {

    private String id;
    private String albumId;
    private String ownerId;
    private String friendId;
    private PermissionEnum permission;

}
