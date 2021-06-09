package com.baidu.yjf.item.dao;

import com.baidu.yjf.core.dao.ICrudDao;
import com.baidu.yjf.item.po.Sku;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SkuDao extends ICrudDao<Sku> {

    @Select("select * from sku_ where spu_id_ = #{skuId}")
    public List<Sku> findBySkuId(Integer spuId);

}
