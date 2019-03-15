package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.dto.ExchangegramSimpleDTO;
import imcamilo.com.github.wlx.dto.PermissionEnum;
import imcamilo.com.github.wlx.mapper.ExchangegramMapper;
import imcamilo.com.github.wlx.model.Exchangegram;
import imcamilo.com.github.wlx.model.ExchangegramSimple;
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

    public void update(ExchangegramDTO exchangegramDTO){
        exchangegramMapper.updatePermission(exchangegramDTO.getPermission().name(), exchangegramDTO.getId());
    }

    public List<ExchangegramSimpleDTO> findAllByPermissionAndAlbumId(Integer albumId, PermissionEnum permissionEnum) {
        List<ExchangegramSimple> list = exchangegramMapper.findAllByAlbumIdAndPermission(albumId, permissionEnum.name());
        return list.stream().map(ExchangegramSimple::toDTO).collect(Collectors.toList());
    }

    public List<ExchangegramDTO> findAll() {
        List<Exchangegram> listex= exchangegramMapper.findAll();
        return listex.stream().map(Exchangegram::toDTO).collect(Collectors.toList());
    }

}
