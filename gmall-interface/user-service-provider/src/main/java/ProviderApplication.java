import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext provider = new ClassPathXmlApplicationContext("provider.xml");
        provider.start();
        System.in.read();
    }
}
