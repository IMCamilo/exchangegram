package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.AlbumDTO;
import imcamilo.com.github.wlx.dto.PhotoDTO;
import imcamilo.com.github.wlx.dto.UserDTO;
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

    @Autowired
    public FetchDataServiceImp(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<UserDTO> getAllUsers() {
        ResponseEntity<List<UserDTO>> response = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/users",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<UserDTO>>(){});
        return response.getBody();
    }

    public List<AlbumDTO> getAllAlbums() {
        ResponseEntity<List<AlbumDTO>> response = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/albums",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<AlbumDTO>>(){});
        return response.getBody();
    }

    public List<PhotoDTO> getAllPhotos() {
        ResponseEntity<List<PhotoDTO>> response = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/photos",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<PhotoDTO>>(){});
        return response.getBody();
    }

}
