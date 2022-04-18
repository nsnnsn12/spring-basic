package hello.core.discount.singletone;

import hello.core.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {
    @Test
    public void configurationDeep() throws Exception{
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //given
        AppConfig bean = ac.getBean(AppConfig.class);
        System.out.println("bean = " + bean.getClass());
        //when

        //then

    }
}
