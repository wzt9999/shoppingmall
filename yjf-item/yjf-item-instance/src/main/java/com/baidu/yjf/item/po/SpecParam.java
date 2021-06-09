package com.baidu.yjf.item.po;

import com.baidu.yjf.core.po.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("spec_param_")
public class SpecParam extends BaseEntity {

    @TableField("cid_")
    private Long cid;
    @TableField("group_id_")
    private Long groupId;
    @TableField("name_")
    private String name;
    @TableField("numeric_")
    private Boolean numeric;
    @TableField("unit_")
    private String unit;
    @TableField("generic_")
    private Boolean generic;
    @TableField("searching_")
    private Boolean searching;
    @TableField("segments_")
    private String segments;


}
