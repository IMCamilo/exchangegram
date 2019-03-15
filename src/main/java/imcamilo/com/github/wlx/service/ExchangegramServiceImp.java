package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.dto.PermissionEnum;
import imcamilo.com.github.wlx.mapper.ExchangegramMapper;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Camilo Jorquera on 3/14/19
 */
@Service
public class ExchangegramServiceImp implements ExchangegramService {

    private ExchangegramMapper exchangegramMapper;

    @Autowired
    public ExchangegramServiceImp(ExchangegramMapper exchangegramMapper) {
        this.exchangegramMapper = exchangegramMapper;
    }

    public void save(ExchangegramDTO exchangegramDTO){
       exchangegramMapper.save(exchangegramDTO.getAlbumId(), exchangegramDTO.getOwnerId(),
               exchangegramDTO.getFriendId(), exchangegramDTO.getPermission().name());
    }

    public List<ExchangegramDTO> findAllByPermissionAndAlbumId(PermissionEnum permissionEnum, Integer albumId) {
        //List<Exchangegram> listExchangesByPermissionAndAlbum = exchangegramMapper.findAllByPermissionAndAlbumId(permissionEnum, albumId);
        //return listExchangesByPermissionAndAlbum.stream().map(Exchangegram::toDTO).collect(Collectors.toList());
        return null;
    }

}
