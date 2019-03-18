package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.PostDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
public interface PostService {

    void saveAllPosts(List<PostDTO> commentDTOList);

}
