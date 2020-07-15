package java.com.micro.model;

import java.util.Map;

/**
 * 响应工具类
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:23
 */
public class ResultUtils {
    public static Result success(String successMsg, Map<String,Object> data){
        Result ar=new Result();
        ar.setCode(0);
        ar.setMsg(successMsg);
        ar.setData(data);
        return ar;
    }
    public static Result success(String successMsg,Object data){
        Result ar=new Result();
        ar.setCode(0);
        ar.setMsg(successMsg);
        ar.setData(data);
        return ar;
    }
    public static Result error(String errorMsg){
        Result ar=new Result();
        ar.setCode(1);
        ar.setMsg(errorMsg);
        ar.setData(null);
        return ar;
    }
}

