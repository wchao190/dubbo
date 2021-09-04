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
public class UserServiceImpl2 implements UserService {
    public List<UserAddress> getUserAddress(String userId) {
        System.out.println("新版本！");
        UserAddress address1 = new UserAddress(1, "杭州分校", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "上海分校", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}
