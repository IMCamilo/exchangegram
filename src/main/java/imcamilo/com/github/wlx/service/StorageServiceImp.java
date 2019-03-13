package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.dto.UserDTO;
import imcamilo.com.github.wlx.model.Album;
import imcamilo.com.github.wlx.model.Photo;
import imcamilo.com.github.wlx.model.User;
import imcamilo.com.github.wlx.repository.AlbumRepository;
import imcamilo.com.github.wlx.repository.PhotoRepository;
import imcamilo.com.github.wlx.repository.UserRepository;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Service
public class StorageServiceImp implements StorageService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    PhotoRepository photoRepository;

    public void saveUser(UserDTO userDTO) {
        userRepository.deleteAll();
        userRepository.save(DTOMapper.toEntity(userDTO));
    }

    public void saveAllUsers(List<UserDTO> userDTOList) {
        userRepository.deleteAll();
        List<User> userList = userDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        userRepository.saveAll(userList);
    }

    public void saveAlbum(AlbumDTO albumDTO) {
        albumRepository.deleteAll();
        albumRepository.save(DTOMapper.toEntity(albumDTO));
    }

    public void saveAllAlbums(List<AlbumDTO> albumDTOList) {
        albumRepository.deleteAll();
        List<Album> albumList = albumDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        albumRepository.saveAll(albumList);
    }

    public void savePhoto(PhotoDTO photoDTO) {
        photoRepository.deleteAll();
        photoRepository.save(DTOMapper.toEntity(photoDTO));
    }

    public void saveAllPhotos(List<PhotoDTO> photoDTOList) {
        photoRepository.deleteAll();
        List<Photo> photoList = photoDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        photoRepository.saveAll(photoList);
    }

}
