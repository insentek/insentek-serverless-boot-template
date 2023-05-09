package com.insentek.serverless.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.insentek.serverless.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hao.ding@insentek.com
 * @Date: 2023/5/9 14:43
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
