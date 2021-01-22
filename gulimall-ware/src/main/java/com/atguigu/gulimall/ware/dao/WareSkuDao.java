package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author ouyangyi
 * @email oyy994@163.com
 * @date 2021-01-21 14:14:30
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
