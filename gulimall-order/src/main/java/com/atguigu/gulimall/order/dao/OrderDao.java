package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ouyangyi
 * @email oyy994@163.com
 * @date 2021-01-21 14:13:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
