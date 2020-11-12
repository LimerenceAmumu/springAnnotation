package com.amumu.conditional;

import com.amumu.domain.Person;
import org.springframework.context.annotation.*;

/**
 * @author Amumu
 * @create 2019/7/30 10:11
 *
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan(value = {"com.amumu.conditional"})
public class ConditionalConfig {
    @Conditional(WindowsCondition.class)
    @Bean(name = "billPer")
    public Person getBillPerson(){
        return new Person("bill",56);
    }

    @Conditional(linuxCondition.class)
    @Bean(name = "linusPer")
    public Person getLinuxPerson(){
        return new Person("linus",56);
    }

}
