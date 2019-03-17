package com.lhp.spring.test;

import com.lhp.spring.config.MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 李贺鹏
 * @create 2019/3/17 15:02
 */
public class IOCTestLifeCycle {
    @Test
    public void test01(){
        //@Bean("myRain")
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
        /**
         * Rain 实例化
         * beanDefinitionName = mainConfigLifeCycle
         * beanDefinitionName = myRain
         * */
    }
    @Test
    public void test02(){
        //@Bean(value = "myRain",initMethod = "initRain",destroyMethod = "destoryRain")
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
        //annotationConfigApplicationContext.getBean("myRain");
        annotationConfigApplicationContext.close();

        /**
         * Rain 实例化
         * beanDefinitionName = mainConfigLifeCycle
         * beanDefinitionName = myRain
         * */
    }
    @Test
    public void test03(){
        //@Bean(value = "myRain",initMethod = "initRain",destroyMethod = "destoryRain")
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

        annotationConfigApplicationContext.close();
        /**
         * "C:\Program Files\Java\jdk1.8.0_191\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:C:\mySoftWare\ideaIU-2018.3.5.win\lib\idea_rt.jar=54302:C:\mySoftWare\ideaIU-2018.3.5.win\bin -Dfile.encoding=UTF-8 -classpath "C:\mySoftWare\ideaIU-2018.3.5.win\lib\idea_rt.jar;C:\mySoftWare\ideaIU-2018.3.5.win\plugins\junit\lib\junit-rt.jar;C:\mySoftWare\ideaIU-2018.3.5.win\plugins\junit\lib\junit5-rt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\rt.jar;D:\Code\springAnnotation\target\test-classes;D:\Code\springAnnotation\target\classes;D:\geZhongKu\maven\repository_pinyougou\org\springframework\spring-context\5.1.0.RELEASE\spring-context-5.1.0.RELEASE.jar;D:\geZhongKu\maven\repository_pinyougou\org\springframework\spring-aop\5.1.0.RELEASE\spring-aop-5.1.0.RELEASE.jar;D:\geZhongKu\maven\repository_pinyougou\org\springframework\spring-beans\5.1.0.RELEASE\spring-beans-5.1.0.RELEASE.jar;D:\geZhongKu\maven\repository_pinyougou\org\springframework\spring-core\5.1.0.RELEASE\spring-core-5.1.0.RELEASE.jar;D:\geZhongKu\maven\repository_pinyougou\org\springframework\spring-jcl\5.1.0.RELEASE\spring-jcl-5.1.0.RELEASE.jar;D:\geZhongKu\maven\repository_pinyougou\org\springframework\spring-expression\5.1.0.RELEASE\spring-expression-5.1.0.RELEASE.jar;D:\geZhongKu\maven\repository_pinyougou\junit\junit\4.12\junit-4.12.jar;D:\geZhongKu\maven\repository_pinyougou\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 com.lhp.spring.test.IOCTestLifeCycle,test03
         * Blue 实例化
         * Blue init...
         * Rain 实例化
         * Rain init...
         * beanDefinitionName = org.springframework.context.annotation.internalConfigurationAnnotationProcessor
         * beanDefinitionName = org.springframework.context.annotation.internalAutowiredAnnotationProcessor
         * beanDefinitionName = org.springframework.context.annotation.internalCommonAnnotationProcessor
         * beanDefinitionName = org.springframework.context.event.internalEventListenerProcessor
         * beanDefinitionName = org.springframework.context.event.internalEventListenerFactory
         * beanDefinitionName = mainConfigLifeCycle
         * beanDefinitionName = blue
         * beanDefinitionName = myRain
         * Rain destory...
         * Blue destory...
         *
         * Process finished with exit code 0
         * */

    }
}
