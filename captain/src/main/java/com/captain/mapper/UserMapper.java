package com.captain.mapper;

import com.captain.beans.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {

    User isUser(@Param("name") String name, @Param("password") String password);

}
