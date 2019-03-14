package imcamilo.com.github.wlx.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
@Getter
@Setter
public class ExchangegramDTO {

    private Integer albumId;
    private Integer ownerId;
    private Integer friendId;
    private PermissionEnum permission;

}
