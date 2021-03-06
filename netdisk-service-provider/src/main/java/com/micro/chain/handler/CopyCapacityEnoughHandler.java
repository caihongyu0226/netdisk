package com.micro.chain.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micro.chain.core.ContextRequest;
import com.micro.chain.core.ContextResponse;
import com.micro.chain.core.Handler;
import com.micro.chain.param.CopyRequest;
import com.micro.disk.bean.UserCapacityBean;
import com.micro.disk.service.UserCapacityService;

@Component
public class CopyCapacityEnoughHandler extends Handler {
	@Autowired
	private UserCapacityService userCapacityService;
	
	@Override
	public void doHandler(ContextRequest request, ContextResponse response) {
		if(request instanceof CopyRequest){
			CopyRequest bean=(CopyRequest) request;
			
			UserCapacityBean capacity=userCapacityService.findUserCapacity(bean.getUserid());
			if(bean.getCapacity()>(capacity.getTotalcapacity()-capacity.getUsedcapacity())){
				throw new RuntimeException("您的存储空间不足,请联系管理员");
			}
		}else{
			throw new RuntimeException("CopyCapacityEnoughHandler==参数不对");
		}
	}
}
