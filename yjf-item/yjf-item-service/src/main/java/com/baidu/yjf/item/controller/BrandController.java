package com.baidu.yjf.item.controller;

import com.baidu.yjf.core.controller.BaseController;
import com.baidu.yjf.item.po.Brand;
import com.baidu.yjf.item.po.Category;
import com.baidu.yjf.item.service.IBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController<IBrandService, Brand> {

    @Override
    public void afterEdit(Brand entity) {
        //得到品牌的所属分类
        List<Category> categories = service.selectCategoryByBrand(entity.getId());
        Long[] ids = new Long[categories.size()];
        for (int i=0; i < categories.size(); i++) {
            ids[i] = categories.get(i).getId();
        }
        entity.setCategoryIds(ids);
    }

    @ApiOperation(value= "根据ids查询品牌", notes = "根据ids查询")
    @GetMapping("/list-by-ids")
    public List<Brand> selectBrandByIds(@RequestParam("ids") List<Long> ids) {
        return service.selectBrandByIds(ids);
    }
}
