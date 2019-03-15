package imcamilo.com.github.wlx.model;

import imcamilo.com.github.wlx.dto.ExchangegramSimpleDTO;
import imcamilo.com.github.wlx.dto.PermissionEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Camilo Jorquera on 3/15/19
 */
@Getter
@Setter
public class ExchangegramSimple {

    Integer id;
    String name;
    String email;
    PermissionEnum permission;

    public ExchangegramSimpleDTO toDTO() {
        ExchangegramSimpleDTO  exchangegramSimpleDTO = new ExchangegramSimpleDTO ();
        exchangegramSimpleDTO.setId(this.getId());
        exchangegramSimpleDTO.setName(this.getName());
        exchangegramSimpleDTO.setEmail(this.getEmail());
        exchangegramSimpleDTO.setPermission(this.getPermission());
        return exchangegramSimpleDTO;
    }

}