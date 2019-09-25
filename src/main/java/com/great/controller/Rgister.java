package com.great.controller;

import com.great.CLibrary;
import com.great.GtControllerSdk;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Rgister implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        GtControllerSdk gtControllerSdk = (GtControllerSdk) applicationContext.getBean("gtControllerSdk");
        //注册回调函数
        //入参:type(回调消息类型)：1.控制器上线; 2. 控制器离线; 3.告警和修复; 4.参数和状态变化
        //回调XML详情信息请见手册
        CLibrary.GtControllerSdkCallback callback = (type, xml, param) -> {
            System.out.println(type);
            System.out.println(xml);
            System.out.println(param);
        };
        int alarmType = 3;
        int state = gtControllerSdk.registerCallback(alarmType, callback, "alternativeParam");
        System.out.println(state);
    }
}
