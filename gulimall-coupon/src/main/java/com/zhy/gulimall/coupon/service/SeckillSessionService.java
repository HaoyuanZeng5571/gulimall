package com.zhy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhy.common.utils.PageUtils;
import com.zhy.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author zhy5571
 * @email sunlightcs@gmail.com
 * @date 2023-06-12 10:49:27
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

