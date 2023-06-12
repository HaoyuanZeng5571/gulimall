package com.zhy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhy.common.utils.PageUtils;
import com.zhy.gulimall.ware.entity.WmsWareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zhy5571
 * @email sunlightcs@gmail.com
 * @date 2023-06-12 11:14:18
 */
public interface WmsWareInfoService extends IService<WmsWareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

