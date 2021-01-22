package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ouyangyi
 * @email oyy994@163.com
 * @date 2021-01-21 14:10:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
