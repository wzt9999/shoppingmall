package com.baidu.yjf.item.controller;

import com.baidu.yjf.core.controller.BaseController;
import com.baidu.yjf.item.po.SpuDetail;
import com.baidu.yjf.item.service.ISpuDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spu-detail")
public class SpuDetailController extends BaseController<ISpuDetailService, SpuDetail> {

}
