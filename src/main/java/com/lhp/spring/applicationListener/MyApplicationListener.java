package com.lhp.spring.applicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Amumu
 * @create 2019/9/8 8:05
 * [interface] ApplicationListener<E extends ApplicationEvent>
 *     用于监听容器中发生的事件
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    //监听到的事件触发时执行此函数
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("发生了..."+event);
        /*
        刷新和关闭事件
        * 发生了...org.springframework.context.event.ContextRefreshedEvent
        * 发生了...org.springframework.context.event.ContextClosedEvent
        * */

    }
}
