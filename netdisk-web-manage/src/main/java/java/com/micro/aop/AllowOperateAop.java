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
 * @date 2020/7/15 14:55
 */
@Aspect
@Component
public class AllowOperateAop {
    @Pointcut("execution(* com.micro.controller.TypeComponentController.delete(..))")
    private void pointcut1(){}

    @Pointcut("execution(* com.micro.controller.TypeComponentController.update(..))")
    private void pointcut2(){}

    @Pointcut("execution(* com.micro.controller.TypeComponentController.save(..))")
    private void pointcut3(){}

    @Pointcut("execution(* com.micro.controller.TypeSuffixController.delete(..))")
    private void pointcut4(){}

    @Pointcut("execution(* com.micro.controller.TypeSuffixController.update(..))")
    private void pointcut5(){}

    @Pointcut("execution(* com.micro.controller.TypeSuffixController.save(..))")
    private void pointcut6(){}

    @NacosValue(value="${allowddelete}",autoRefreshed=true)
    private boolean allowddelete;

    @Pointcut("pointcut1() || pointcut2() || pointcut3() || pointcut4() || pointcut5() || pointcut6()")
    private void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint jp){
        if(!allowddelete){
            throw new RuntimeException("演示环境,不允许进行该操作!");
        }
    }
}

