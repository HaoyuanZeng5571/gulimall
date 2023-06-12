package com.zhy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhy.common.utils.PageUtils;
import com.zhy.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author zhy5571
 * @email sunlightcs@gmail.com
 * @date 2023-06-11 11:58:26
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

