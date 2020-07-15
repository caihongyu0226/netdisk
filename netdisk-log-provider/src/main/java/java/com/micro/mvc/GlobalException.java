package java.com.micro.mvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.com.micro.model.Result;
import java.com.micro.model.ResultUtils;

/**
 * 全局异常
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:47
 */
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class) //异常类型
    @ResponseBody
    public Result defaultExceptionHandler(HttpServletRequest req, Exception e){

        return ResultUtils.error(e.getMessage());
    }
}
