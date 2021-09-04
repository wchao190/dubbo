package com.atguigu.gmall;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.impl.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 服务 提供 实现
 */
@Service
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddress(String userId) {
        System.out.println("老版本!");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}