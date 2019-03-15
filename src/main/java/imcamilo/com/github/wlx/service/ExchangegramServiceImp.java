package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.dto.PermissionEnum;
import imcamilo.com.github.wlx.model.Exchangegram;
import imcamilo.com.github.wlx.repository.ExchangegramRepository;
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

    private ExchangegramRepository exchangegramRepository;

    @Autowired
    public ExchangegramServiceImp(ExchangegramRepository exchangegramRepository) {
        this.exchangegramRepository = exchangegramRepository;
    }

    public void save(ExchangegramDTO exchangegramDTO){
        exchangegramRepository.save(DTOMapper.toEntity(exchangegramDTO));
    }

    public List<ExchangegramDTO> findAllByPermissionAndAlbumId(PermissionEnum permissionEnum, Integer albumId) {
        List<Exchangegram> listExchangesByPermissionAndAlbum = exchangegramRepository.findAllByPermissionAndAlbumId(permissionEnum, albumId);
        return listExchangesByPermissionAndAlbum.stream().map(Exchangegram::toDTO).collect(Collectors.toList());
    }

}
