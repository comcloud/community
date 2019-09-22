package life.majiang.community.dto;

import lombok.Data;

/**
 * @author 张玉雷
 */
@Data
public class TagValueDTO {

    /**
     * 自己的序列id
     * */
    private Integer vId;
    /**
     * 名称
     * */
    private String tName;
    /**
     * 映射tab表的id
     * */
    private Integer tabId;
}
