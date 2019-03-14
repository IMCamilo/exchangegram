package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.AlbumDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface AlbumService {

    List<AlbumDTO> findAllByUserId(Integer id);

    void saveAllAlbums(List<AlbumDTO> albumDTOList);

}
