package life.majiang.community.service.impl;

import life.majiang.community.dto.TagDTO;
import life.majiang.community.mapper.TagMapper;
import life.majiang.community.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张玉雷
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<TagDTO> get() {
        /**
         * 1.获取所有分类的总数
         * 2.获取所有分类的名称
         * 3.获取所有分类中的所有的子分类
         * 4.使用这些数据拼接为一个List<TagDTO>返回
         * */
        List<TagDTO> list = new ArrayList<>();

        int count = tagMapper.getCount();
        List<String> names = tagMapper.getName();
        for (int i = 0 ; i < count; i++){
            TagDTO tag = new TagDTO();
            tag.setCategoryName(names.get(i));
            List<String> lists = tagMapper.getChild(i+1);
            tag.setTags(lists);
            list.add(tag);
        }
        return list;
    }
}
