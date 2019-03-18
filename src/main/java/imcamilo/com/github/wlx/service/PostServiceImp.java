package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.PostDTO;
import imcamilo.com.github.wlx.mapper.PostMapper;
import imcamilo.com.github.wlx.model.Post;
import imcamilo.com.github.wlx.util.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Service
public class PostServiceImp implements PostService {

    private PostMapper postMapper;

    @Autowired
    public PostServiceImp(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public void saveAllPosts(List<PostDTO> postDTOList) {
        List<Post> postList = postDTOList.stream().map(DTOMapper::toEntity).collect(Collectors.toList());
        postList.forEach( post ->
                postMapper.save(post.getId(), post.getUserId(), post.getTitle(), post.getBody()));

    }

}
