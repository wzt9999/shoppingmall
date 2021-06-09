package com.baidu.yjf.item.service;


import com.baidu.yjf.core.service.ICrudService;
import com.baidu.yjf.item.po.Category;

import java.util.List;

public interface ICategoryService extends ICrudService<Category> {

    public List<String> selectNamesByIds(List<Long> ids);

}
