package com.txx.dao;

import com.txx.entity.dto.UserDto;
import com.txx.entity.pojo.User;

public interface UserDao {
     User findUser(UserDto userDto);
}
