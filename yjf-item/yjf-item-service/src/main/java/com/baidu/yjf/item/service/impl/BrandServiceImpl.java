package com.baidu.yjf.item.service.impl;

import com.baidu.yjf.core.service.impl.CrudServiceImpl;
import com.baidu.yjf.item.po.Brand;
import com.baidu.yjf.item.po.Category;
import com.baidu.yjf.item.service.IBrandService;
import com.baidu.yjf.item.dao.BrandDao;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandServiceImpl extends CrudServiceImpl<Brand> implements IBrandService {

    @Override
    @Transactional(readOnly = false)
    public boolean saveOrUpdate(Brand entity) {
        boolean result = super.saveOrUpdate(entity);

        //删除商品和分类的关联
        ((BrandDao) getBaseMapper()).deleteCategoryByBrand(entity.getId());

        //天剑商品和分类的关联
        Long[] categoryIds = entity.getCategoryIds();
        if (null != categoryIds) {
            for (Long categoryId : categoryIds) {
                ((BrandDao) getBaseMapper()).insertCategoryAndBrand(categoryId, entity.getId());
            }
        }

        return result;
    }

    @Override
    public List<Category> selectCategoryByBrand(Long id) {
        return ((BrandDao) getBaseMapper()).selectCategoryByBrand(id);
    }

    @Override
    public List<Brand> selectBrandByIds(List<Long> ids) {
        QueryWrapper<Brand> queryWrapper = Wrappers.<Brand>query().in("id_", ids);
        return getBaseMapper().selectList(queryWrapper);
    }
}
