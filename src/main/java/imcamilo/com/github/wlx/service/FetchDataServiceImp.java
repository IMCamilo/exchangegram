package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
@Service
public class FetchDataServiceImp implements FetchDataService {

    private final RestTemplate restTemplate;
    private ConfigurationService configurationService;

    @Autowired
    public FetchDataServiceImp(RestTemplateBuilder restTemplateBuilder,
                               ConfigurationService configurationService) {
        this.restTemplate = restTemplateBuilder.build();
        this.configurationService = configurationService;
    }

    public List<UserDTO> getAllUsers() {
        ResponseEntity<List<UserDTO>> response = restTemplate.exchange(configurationService.getUsersEndpoint(), HttpMethod.GET, null,
                new ParameterizedTypeReference<List<UserDTO>>(){});
        return response.getBody();
    }

    public List<AlbumDTO> getAllAlbums() {
        ResponseEntity<List<AlbumDTO>> response = restTemplate.exchange(configurationService.getAlbumsEndpoint(), HttpMethod.GET, null,
                new ParameterizedTypeReference<List<AlbumDTO>>(){});
        return response.getBody();
    }

    public List<PhotoDTO> getAllPhotos() {
        ResponseEntity<List<PhotoDTO>> response = restTemplate.exchange(configurationService.getPhotosEndpoint(), HttpMethod.GET, null,
                new ParameterizedTypeReference<List<PhotoDTO>>(){});
        return response.getBody();
    }

    public List<PostDTO> getAllPosts() {
        ResponseEntity<List<PostDTO>> response = restTemplate.exchange(configurationService.getPostsEndpoint(), HttpMethod.GET, null,
                new ParameterizedTypeReference<List<PostDTO>>(){});
        return response.getBody();
    }

    public List<CommentDTO> getAllComments() {
        ResponseEntity<List<CommentDTO>> response = restTemplate.exchange(configurationService.getCommentsEndpoint(), HttpMethod.GET, null,
                new ParameterizedTypeReference<List<CommentDTO>>(){});
        return response.getBody();
    }

}
