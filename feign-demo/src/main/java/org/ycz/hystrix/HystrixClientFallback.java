package org.ycz.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.ycz.entity.User;
import org.ycz.service.UserFeignClient;
@Component
public class HystrixClientFallback implements UserFeignClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);


	@Override
	public List<User> findAllFeign() {
		// TODO Auto-generated method stub
		HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法");
	    return new ArrayList<User>();
	}
  }