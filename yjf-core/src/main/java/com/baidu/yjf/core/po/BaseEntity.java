package com.baidu.yjf.core.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonIgnoreProperties(value = {"handler"})
public abstract class BaseEntity implements Serializable {

	/**
	 * 实体编号（唯一标识）
	 */
	@TableId(value = "id_", type = IdType.AUTO)
	protected Long id;

}
