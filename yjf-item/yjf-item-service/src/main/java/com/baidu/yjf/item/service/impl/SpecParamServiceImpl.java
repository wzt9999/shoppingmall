package com.baidu.yjf.item.service.impl;

import com.baidu.yjf.core.service.impl.CrudServiceImpl;
import com.baidu.yjf.item.po.SpecParam;
import com.baidu.yjf.item.service.ISpecParamService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecParamServiceImpl extends CrudServiceImpl<SpecParam> implements ISpecParamService {

    @Override
    public List<SpecParam> list(SpecParam entity) {
        QueryWrapper<SpecParam> queryWrapper = Wrappers.<SpecParam>query();
        //根据分类id查询规格参数
        if (null != entity.getCid()) {
            queryWrapper.eq("cid_", entity.getCid());
        }
        if (null != entity.getSearching()) {
            queryWrapper.eq("searching_", entity.getSearching());
        }
        return getBaseMapper().selectList(queryWrapper);
    }
}
