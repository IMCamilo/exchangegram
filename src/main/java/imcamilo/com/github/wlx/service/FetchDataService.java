package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.*;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface FetchDataService {

    List<UserDTO> getAllUsers();

    List<AlbumDTO> getAllAlbums();

    List<PhotoDTO> getAllPhotos();

    List<PostDTO> getAllPosts();

    List<CommentDTO> getAllComments();

}
