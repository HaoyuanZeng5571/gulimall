package com.zhy.gulimall.coupon.dao;

import com.zhy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhy5571
 * @email sunlightcs@gmail.com
 * @date 2023-06-12 10:49:27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
