package com.zhy.gulimall.order.dao;

import com.zhy.gulimall.order.entity.OmsOrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zhy5571
 * @email sunlightcs@gmail.com
 * @date 2023-06-12 11:12:47
 */
@Mapper
public interface OmsOrderItemDao extends BaseMapper<OmsOrderItemEntity> {
	
}
