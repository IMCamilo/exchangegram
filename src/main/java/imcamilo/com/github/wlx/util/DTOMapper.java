package imcamilo.com.github.wlx.util;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.dto.ExchangegramDTO;
import imcamilo.com.github.wlx.dto.UserDTO;
import imcamilo.com.github.wlx.model.Album;
import imcamilo.com.github.wlx.model.Photo;
import imcamilo.com.github.wlx.model.Exchangegram;
import imcamilo.com.github.wlx.model.User;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public class DTOMapper {

    private DTOMapper() {

    }

    private static void toEntity(UserDTO userDTO, User user){
        user.setIdSource(userDTO.getId());
        user.setName(userDTO.getName());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setAddress(userDTO.getAddress());
        user.setPhone(userDTO.getPhone());
        user.setWebsite(userDTO.getWebsite());
        user.setCompany(userDTO.getCompany());
    }

    public static User toEntity(UserDTO userDTO){
        User user = new User();
        toEntity(userDTO, user);
        return user;
    }

    private static void toEntity(AlbumDTO albumDTO, Album album){
        album.setIdSource(albumDTO.getId());
        album.setUserId(albumDTO.getUserId());
        album.setTitle(albumDTO.getTitle());
    }

    public static Album toEntity(AlbumDTO albumDTO){
        Album album = new Album();
        toEntity(albumDTO, album);
        return album;
    }

    private static void toEntity(PhotoDTO photoDTO, Photo photo){
        photo.setIdSource(photoDTO.getId());
        photo.setAlbumId(photoDTO.getAlbumId());
        photo.setTitle(photoDTO.getTitle());
        photo.setUrl(photoDTO.getUrl());
        photo.setThumbnailUrl(photoDTO.getThumbnailUrl());
    }

    public static Photo toEntity(PhotoDTO photoDTO){
        Photo photo = new Photo();
        toEntity(photoDTO, photo);
        return photo;
    }

    private static void toEntity(ExchangegramDTO exchangegramDTO, Exchangegram exchangegram){
        exchangegram.setId(exchangegramDTO.getId());
        exchangegram.setAlbumId(exchangegramDTO.getAlbumId());
        exchangegram.setOwnerId(exchangegramDTO.getOwnerId());
        exchangegram.setFriendId(exchangegramDTO.getFriendId());
        exchangegram.setPermission(exchangegramDTO.getPermission());
    }

    public static Exchangegram toEntity(ExchangegramDTO exchangegramDTO){
        Exchangegram exchangegram = new Exchangegram();
        toEntity(exchangegramDTO, exchangegram);
        return exchangegram;
    }

}
