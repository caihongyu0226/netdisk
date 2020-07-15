package java.com.micro.aop;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 文件下载时，控制是否允许下载，主要是阿里云配置太低，如果下载则容易导致宕机
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:58
 */
@Aspect
@Component
public class AllowDownloadAop {
    @Pointcut("execution(* com.micro.controller.FileController.download(..))")
    private void pointcut(){}

    @NacosValue(value="${allowdownload}",autoRefreshed=true)
    private boolean allowdownload;

    @Before("pointcut()")
    public void before(JoinPoint jp){
        if(!allowdownload){
            throw new RuntimeException("演示环境,不允许进行文件下载!");
        }
    }
}

