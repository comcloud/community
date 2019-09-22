package life.majiang.community.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 *
 * @author codedrinker
 * @date 2019/6/5
 */
@Data
public class TagDTO {
    /**
     * 对应范畴的名称
     * */
    private String categoryName;
    /**
     * 对应范畴中所有的标签
     * */
    private List<String> tags;
}
