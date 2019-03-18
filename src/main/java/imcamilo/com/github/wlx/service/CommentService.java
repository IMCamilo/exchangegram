package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.CommentDTO;
import imcamilo.com.github.wlx.dto.CommentPlusDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
public interface CommentService {

    void saveAllComments(List<CommentDTO> commentDTOList);

    List<CommentDTO> findAllByName(String name);

    List<CommentPlusDTO> findAllByUserId(Integer userId);

}
