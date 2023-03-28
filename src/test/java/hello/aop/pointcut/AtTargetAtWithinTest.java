package hello.aop.pointcut;

import hello.aop.member.annotation.ClassAop;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;

public class AtTargetAtWithinTest {

    @Slf4j
    @Aspect
    static class AtTargetAtWithinAspect {

    }

    static class Parent {
        public void parentMethod(){}
    }

    @ClassAop
    static class Child extends Parent {
        public void childMethod(){}
    }
}
