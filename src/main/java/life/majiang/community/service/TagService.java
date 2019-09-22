package life.majiang.community.service;

import life.majiang.community.dto.TagDTO;

import java.util.List;

/**
 * @author 张玉雷
 */
public interface TagService {

    /**
     * @return 返回标签集合
     */
    List<TagDTO> get();
}
