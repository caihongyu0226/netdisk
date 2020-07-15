package java.com.micro.mvc;


import javax.servlet.http.HttpServletRequest;

import com.micro.disk.bean.SessionUserBean;

public class UserInfoUtils {
	
	public static SessionUserBean getBean(HttpServletRequest request){
		SessionUserBean userInfo=(SessionUserBean) request.getAttribute("userInfo");
		return userInfo;
	}
}
