package com.baidu.yjf.item.service;


import com.baidu.yjf.core.service.ICrudService;
import com.baidu.yjf.item.po.Spu;

public interface ISpuService extends ICrudService<Spu> {

    /**
     * 保存spu
     * @param spu
     *   - spu
     *   - spuDetail
     *   - skus
     */
    public void saveSpu(Spu spu);

}
