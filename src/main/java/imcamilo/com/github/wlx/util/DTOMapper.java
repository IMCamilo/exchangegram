package imcamilo.com.github.wlx.util;

import imcamilo.com.github.wlx.dto.*;
import imcamilo.com.github.wlx.dto.PostDTO;
import imcamilo.com.github.wlx.model.*;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public class DTOMapper {

    private DTOMapper() {

    }

    private static void toEntity(UserDTO userDTO, User user) {
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setWebsite(userDTO.getWebsite());
    }

    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        toEntity(userDTO, user);
        return user;
    }

    private static void toEntity(AlbumDTO albumDTO, Album album) {
        album.setId(albumDTO.getId());
        album.setUserId(albumDTO.getUserId());
        album.setTitle(albumDTO.getTitle());
    }

    public static Album toEntity(AlbumDTO albumDTO) {
        Album album = new Album();
        toEntity(albumDTO, album);
        return album;
    }

    private static void toEntity(PhotoDTO photoDTO, Photo photo) {
        photo.setId(photoDTO.getId());
        photo.setAlbumId(photoDTO.getAlbumId());
        photo.setTitle(photoDTO.getTitle());
        photo.setUrl(photoDTO.getUrl());
        photo.setThumbnailUrl(photoDTO.getThumbnailUrl());
    }

    public static Photo toEntity(PhotoDTO photoDTO) {
        Photo photo = new Photo();
        toEntity(photoDTO, photo);
        return photo;
    }

    private static void toEntity(ExchangegramDTO exchangegramDTO, Exchangegram exchangegram) {
        exchangegram.setId(exchangegramDTO.getId());
        exchangegram.setAlbumId(exchangegramDTO.getAlbumId());
        exchangegram.setOwnerId(exchangegramDTO.getOwnerId());
        exchangegram.setFriendId(exchangegramDTO.getFriendId());
        exchangegram.setPermission(exchangegramDTO.getPermission());
    }

    public static Exchangegram toEntity(ExchangegramDTO exchangegramDTO) {
        Exchangegram exchangegram = new Exchangegram();
        toEntity(exchangegramDTO, exchangegram);
        return exchangegram;
    }

    private static void toEntity(ExchangegramSimpleDTO simpleDTO, ExchangegramSimple exchangegram) {
        exchangegram.setName(simpleDTO.getName());
        exchangegram.setEmail(simpleDTO.getEmail());
        exchangegram.setPermission(simpleDTO.getPermission());
    }

    public static ExchangegramSimple toEntity(ExchangegramSimpleDTO simpleDTO) {
        ExchangegramSimple exchangegram = new ExchangegramSimple();
        toEntity(simpleDTO, exchangegram);
        return exchangegram;
    }


    private static void toEntity(PostDTO postDTO, Post post) {
        post.setId(postDTO.getId());
        post.setUserId(postDTO.getUserId());
        post.setTitle(postDTO.getTitle());
        post.setBody(postDTO.getBody());
    }

    public static Post toEntity(PostDTO postDTO) {
        Post post = new Post();
        toEntity(postDTO, post);
        return post;
    }

    private static void toEntity(CommentDTO commentDTO, Comment comment) {
        comment.setId(commentDTO.getId());
        comment.setPostId(commentDTO.getPostId());
        comment.setName(commentDTO.getName());
        comment.setEmail(commentDTO.getEmail());
        comment.setBody(commentDTO.getBody());
    }

    public static Comment toEntity(CommentDTO commentDTO) {
        Comment comment = new Comment();
        toEntity(commentDTO, comment);
        return comment;
    }

    private static void toEntity(CommentPlusDTO commentPlusDTO, CommentPlus commentPlus) {
        commentPlus.setId(commentPlusDTO.getId());
        commentPlus.setUserId(commentPlusDTO.getUserId());
        commentPlus.setPostId(commentPlusDTO.getPostId());
        commentPlus.setName(commentPlusDTO.getName());
        commentPlus.setEmail(commentPlusDTO.getEmail());
        commentPlus.setBody(commentPlusDTO.getBody());
    }

    public static CommentPlus toEntity(CommentPlusDTO commentPlusDTO) {
        CommentPlus commentPlus = new CommentPlus();
        toEntity(commentPlusDTO, commentPlus);
        return commentPlus;
    }

}
