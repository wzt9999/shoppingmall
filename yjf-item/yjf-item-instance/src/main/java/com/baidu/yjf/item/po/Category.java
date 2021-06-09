package com.baidu.yjf.item.po;

import com.baidu.yjf.core.po.BaseTreeEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("category_")
public class Category extends BaseTreeEntity {

    @TableField("is_parent_")
    private Boolean isParent = false; //是否为父节点

    @TableField(exist = false)
    private Integer isRoot = 0; //值=1 ： 查询根节点条件

    public String getLabel() { //treeselect需要的属性
        return this.getTitle();
    }

}
