package imcamilo.com.github.wlx.service;

import imcamilo.com.github.wlx.dto.CommentDTO;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/18/19
 */
public interface CommentService {

    void saveAllComments(List<CommentDTO> commentDTOList);

}
