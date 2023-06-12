package com.zhy.gulimall.product.dao;

import com.zhy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhy5571
 * @email sunlightcs@gmail.com
 * @date 2023-06-11 11:58:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
