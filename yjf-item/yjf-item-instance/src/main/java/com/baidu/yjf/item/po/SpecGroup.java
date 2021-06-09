package com.baidu.yjf.item.po;

import com.baidu.yjf.core.po.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@TableName("spec_group_")
@JsonIgnoreProperties(value = {"handler"})
public class SpecGroup extends BaseEntity {

    @TableField("cid_")
    private Long cid;

    @TableField("name_")
    private String name;

    @TableField(exist = false)
    private List<SpecParam> params; //当前组下所有的规格项，使用resultMap懒加载查询

}
