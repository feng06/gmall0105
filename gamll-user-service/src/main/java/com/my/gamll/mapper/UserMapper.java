package com.my.gamll.mapper;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.my.gamll.pojo.UmsMember;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    @Select("select t.* from ums_member t")
    List<UmsMember> selectAllUser();
}
