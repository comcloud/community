package life.majiang.community.mapper;

import life.majiang.community.dto.TagDTO;

import java.util.List;

/**
 * @author 张玉雷
 */
public interface TagMapper {

    /**
     * @return 获取标签分类的数量
     */
    int getCount();

    /**
     * @return 获取分类的名称
     */
    List<String> getName();


    /**
     * @param tId 查询的id
     * @return  获取分类下的所有小分类
     */
    List<String> getChild(int tId);
}
