package com.baidu.yjf.item.controller;

import com.baidu.yjf.core.controller.BaseController;
import com.baidu.yjf.core.po.ResponseBean;
import com.baidu.yjf.item.po.SpecGroup;
import com.baidu.yjf.item.service.ISpecGroupService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/group")
public class SpecGroupController extends BaseController<ISpecGroupService, SpecGroup> {

    @ApiOperation(value="保存规格参数", notes = "保存规格参数")
    @PostMapping("/save-group")
    public ResponseBean saveGroup(@RequestBody List<SpecGroup> specGroup) {
        ResponseBean rm = new ResponseBean();
        try {
            if (null != specGroup && specGroup.size() > 0) {
                service.saveGroup(specGroup.get(0).getCid(), specGroup);
            }
        } catch (Exception e) {
            e.printStackTrace();
            rm.setSuccess(false);
            rm.setMsg("保存失败");
        }
        return rm;
    }

}
