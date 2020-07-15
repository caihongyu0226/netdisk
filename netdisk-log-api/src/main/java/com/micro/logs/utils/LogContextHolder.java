package com.micro.logs.utils;

import com.micro.logs.bean.LogInfo;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 13:59
 */
public class LogContextHolder {
    private static final ThreadLocal<LogInfo> logThtreadLocal = new ThreadLocal<LogInfo>();

    public static void set(LogInfo bean){
        logThtreadLocal.set(bean);
    }

    public static LogInfo get(){
        return logThtreadLocal.get();
    }

    public static void clear(){
        logThtreadLocal.remove();
    }

    public static void setRemark(String remark){
        logThtreadLocal.get().setRemark(remark);
    }
}

