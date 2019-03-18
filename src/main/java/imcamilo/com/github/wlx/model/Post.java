package imcamilo.com.github.wlx.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Getter
@Setter
public class Post implements Serializable {

    private Integer id;
    private Integer userId;
    private String title;
    private String body;

    public Post toDTO() {
        Post post = new Post();
        post.setId(this.getId());
        post.setUserId(this.getUserId());
        post.setTitle(this.getTitle());
        post.setBody(this.getBody());
        return post;
    }

}
