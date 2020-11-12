package com.lhp.spring.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author 李贺鹏
 * @create 2019/3/20 17:18
 */
@Configuration
@PropertySource(value={"classpath:/db.properties"})
public class ProfileConfig {
    @Value("${db.user}")
    private String user;
    @Value("${db.driverClass}")
    private String driverClass;
    //@Profile("dev")

    @Bean(name = "dataSource")
    public DataSource dataSource(@Value("${db.user}")String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://192.168.211.130:3306/test?useUnicode=true&characterEncoding=utf8");
        dataSource.setDriverClass(driverClass);
        System.out.println("test");


        return dataSource;
    }

}
