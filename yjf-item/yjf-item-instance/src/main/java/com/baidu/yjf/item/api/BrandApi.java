package com.baidu.yjf.item.api;

import com.baidu.yjf.item.po.Brand;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/item/brand")
public interface BrandApi {

    @ApiOperation(value= "根据ids查询品牌", notes = "根据ids查询")
    @GetMapping("/list-by-ids")
    public List<Brand> selectBrandByIds(@RequestParam("ids") List<Long> ids);

}
