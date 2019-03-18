package imcamilo.com.github.wlx.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
@Getter
@Component
public class ConfigurationService {

    @Value("${endpoints.users}")
    private String usersEndpoint;

    @Value("${endpoints.albums}")
    private String albumsEndpoint;

    @Value("${endpoints.photos}")
    private String photosEndpoint;

    @Value("${endpoints.posts}")
    private String postsEndpoint;

    @Value("${endpoints.comments}")
    private String commentsEndpoint;

}
