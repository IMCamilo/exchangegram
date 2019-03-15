package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.dto.PermissionEnum;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
public interface ExchangegramService {

    void save(ExchangegramDTO exchangegramDTO);

    List<ExchangegramDTO> findAllByPermissionAndAlbumId(PermissionEnum permissionEnum, Integer albumId);

}