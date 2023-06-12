package com.zhy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhy.common.utils.PageUtils;
import com.zhy.gulimall.member.entity.UmsMemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author zhy5571
 * @email sunlightcs@gmail.com
 * @date 2023-06-12 11:00:00
 */
public interface UmsMemberLoginLogService extends IService<UmsMemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

