package com.baidu.yjf.item.dao;

import com.baidu.yjf.core.dao.ICrudDao;
import com.baidu.yjf.item.po.SpecParam;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SpecParamDao extends ICrudDao<SpecParam> {

    @Select("select * from spec_param_ where group_id_ = #{groupId}")
    public List<SpecParam> findByGroupId(Integer groupId);

}
