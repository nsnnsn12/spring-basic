package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    @Test
    public void autowiredOption() throws Exception{
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{
        //해당하는 빈이 없다면 아예 호출하지 않음.
        @Autowired(required = false)
        public void setNoBean1(Member member){
            System.out.println("member = " + member);
        }

        //null로 들어감.
        @Autowired
        public void setNoBean2(@Nullable Member member){
            System.out.println("member = " + member);
        }

        //empty로 들어감
        @Autowired
        public void setNoBean3(Optional<Member> member){
            System.out.println("member = " + member);
        }
    }
}
