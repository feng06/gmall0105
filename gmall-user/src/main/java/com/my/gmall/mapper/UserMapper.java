package com.my.gmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.gamll.pojo.UmsMember;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<UmsMember> {
    @Select("select * from ums_member")
    List<UmsMember> selectAllUser();
}
