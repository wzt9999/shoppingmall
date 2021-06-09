package com.baidu.yjf.core.service.impl;

import com.baidu.yjf.core.dao.ICrudDao;
import com.baidu.yjf.core.po.BaseEntity;
import com.baidu.yjf.core.service.ICrudService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class CrudServiceImpl<T extends BaseEntity> extends ServiceImpl<ICrudDao<T>, T> implements ICrudService<T> {

    @Override
    public PageInfo<T> listPage(T entity, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            baseMapper.selectByPage(entity);
        });
    }

    @Override
    public List<T> list(T entity) {
        return getBaseMapper().selectList(Wrappers.emptyWrapper());
    }

}
