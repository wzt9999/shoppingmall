package com.baidu.yjf.item.api;

import com.baidu.yjf.item.po.Spu;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/item/spu")
public interface SpuApi {

    @ApiOperation(value="查询所有", notes="查询所有spu")
    @GetMapping("/list-all")
    public List<Spu> selectAll();

    @ApiOperation(value="加载", notes="根据ID加载")
    @GetMapping("/edit/{id}")
    public Spu edit(@PathVariable Long id);


}
