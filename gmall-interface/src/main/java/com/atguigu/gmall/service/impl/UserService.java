package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getUserAddress(String userId);
}
