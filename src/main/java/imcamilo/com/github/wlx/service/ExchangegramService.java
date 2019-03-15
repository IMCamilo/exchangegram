package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.dto.ExchangegramSimpleDTO;
import imcamilo.com.github.wlx.dto.PermissionEnum;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
public interface ExchangegramService {

    void save(ExchangegramDTO exchangegramDTO);

    void update(ExchangegramDTO exchangegramDTO);

    List<ExchangegramSimpleDTO> findAllByPermissionAndAlbumId(Integer albumId, PermissionEnum permissionEnum);

    List<ExchangegramDTO> findAll();

}