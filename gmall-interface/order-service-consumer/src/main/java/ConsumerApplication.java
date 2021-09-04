import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.impl.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = applicationContext.getBean(OrderService.class);
        bean.initOrder("1");
        System.in.read();
    }
}
