package com.baidu.yjf.item.controller;

import com.baidu.yjf.core.controller.BaseController;
import com.baidu.yjf.core.po.ResponseBean;
import com.baidu.yjf.item.po.Spu;
import com.baidu.yjf.item.service.ISpuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spu")
public class SpuController extends BaseController<ISpuService, Spu> {

    @ApiOperation(value = "保存商品信息", notes = "保存商品")
    @PostMapping("/save-spu")
    public ResponseBean saveSpu(@RequestBody Spu spu) {
        ResponseBean rm = new ResponseBean();
        try {
            service.saveSpu(spu);
        } catch (Exception e) {
            e.printStackTrace();
            rm.setSuccess(false);
            rm.setMsg("保存失败");
        }
        return rm;
    }

    @ApiOperation(value="查询所有", notes="查询所有spu")
    @GetMapping("/list-all")
    public List<Spu> selectAll() {
        return service.list(new Spu());
    }

}
