package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.mapper.AlbumMapper;
import imcamilo.com.github.wlx.model.Album;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Service
public class AlbumServiceImp implements AlbumService {

    private AlbumMapper albumMapper;

    @Autowired
    public AlbumServiceImp(AlbumMapper albumMapper) {
        this.albumMapper = albumMapper;
    }

    public List<AlbumDTO> findAllByUserId(Integer id) {
        List<Album> albumList = albumMapper.findAllByUserId(id);
        return albumList.stream().map(Album::toDTO).collect(Collectors.toList());
    }

    public void saveAllAlbums(List<AlbumDTO> albumDTOList) {
        List<Album> albumList = albumDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        albumList.forEach(album -> albumMapper.save(album.getId(), album.getUserId(), album.getTitle()));
    }

}
