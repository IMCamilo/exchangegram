package imcamilo.com.github.wlx.util;

import imcamilo.com.github.wlx.dto.*;
import imcamilo.com.github.wlx.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Component
public class SetupData {

    private FetchDataService fetchDataService;
    private PhotoService photoService;
    private AlbumService albumService;
    private UserService userService;
    private PostService postService;
    private CommentService commentService;

    @Autowired
    public SetupData(FetchDataService fetchDataService, PhotoService photoService,
                     AlbumService albumService, UserService userService,
                     PostService postService, CommentService commentService) {
        this.fetchDataService = fetchDataService;
        this.photoService = photoService;
        this.albumService = albumService;
        this.userService = userService;
        this.postService = postService;
        this.commentService = commentService;
    }

    @PostConstruct
    public void init() {
        List<UserDTO> users = fetchDataService.getAllUsers();
        userService.saveAllUsers(users);
        List<AlbumDTO> albums = fetchDataService.getAllAlbums();
        albumService.saveAllAlbums(albums);
        List<PhotoDTO> photos = fetchDataService.getAllPhotos();
        photoService.saveAllPhotos(photos);
        List<PostDTO> posts = fetchDataService.getAllPosts();
        postService.saveAllPosts(posts);
        List<CommentDTO> comments = fetchDataService.getAllComments();
        commentService.saveAllComments(comments);
    }

}
