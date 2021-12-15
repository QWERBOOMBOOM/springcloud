package com.cyc.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyc.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-15 19:48:20
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}

