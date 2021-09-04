package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.impl.OrderService;
import com.atguigu.gmall.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        List<UserAddress> userAddress = userService.getUserAddress(userId);
        for (UserAddress u : userAddress){
            System.out.println(u.getUserAddress());
        }
        return userAddress;
    }
}
