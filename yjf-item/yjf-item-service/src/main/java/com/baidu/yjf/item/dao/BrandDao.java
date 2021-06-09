package com.baidu.yjf.item.dao;

import com.baidu.yjf.core.dao.ICrudDao;
import com.baidu.yjf.item.po.Brand;
import com.baidu.yjf.item.po.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandDao extends ICrudDao<Brand> {

    /**
     * 删除商品和分类关联
     * @param id
     * @return
     */
    public int deleteCategoryByBrand(Long id);

    /**
     * 关联商品和分类
     * @param categoryId
     * @param brandId
     * @return
     */
    public int insertCategoryAndBrand(@Param("categoryId") Long categoryId, @Param("brandId") Long brandId);

    /**
     * 查询商品的分类
     * @param id
     * @return
     */
    public List<Category> selectCategoryByBrand(Long id);


}
