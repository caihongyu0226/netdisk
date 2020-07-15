package com.micro.logs.aop;

import com.micro.logs.bean.LogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 业务系统给LogProperties配置类赋值的两种方法
 *  * 方案一：@ConfigurationProperties(prefix = "mylog")
 *  * 方案二：系统启动的时候，调用IocFactory，手工创建对象，并且加入容器里面
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:05
 */
public class IocFactory {
    @Autowired
    private AutowireCapableBeanFactory beanFactory;

    @Autowired
    private DefaultListableBeanFactory defaultListableBeanFactory;

    public void init(String projectname,String projectdesc,String loghost){

        LogProperties lp=new LogProperties();
        lp.setProjectname(projectname);
        lp.setProjectdesc(projectdesc);
        lp.setHost(loghost);

        //将new出的对象放入Spring容器中
        defaultListableBeanFactory.registerSingleton("logProperties",lp);

        //自动注入依赖
        beanFactory.autowireBean(lp);
    }
}
