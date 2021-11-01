package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tanzhihan
 * @email 851901870@qq.com
 * @date 2021-06-18 14:30:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
