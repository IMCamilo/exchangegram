package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.model.Album;
import imcamilo.com.github.wlx.repository.AlbumRepository;
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

    private AlbumRepository albumRepository;

    @Autowired
    public AlbumServiceImp(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<AlbumDTO> findAllByUserId(Integer id) {
        List<Album> albumList = albumRepository.findAllByUserId(id);
        return albumList.stream().map(Album::toDTO).collect(Collectors.toList());
    }

    public void saveAllAlbums(List<AlbumDTO> albumDTOList) {
        albumRepository.deleteAll();
        List<Album> albumList = albumDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        albumRepository.saveAll(albumList);
    }

}
