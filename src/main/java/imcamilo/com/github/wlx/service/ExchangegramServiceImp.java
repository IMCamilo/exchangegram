package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.repository.ExchangegramRepository;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
