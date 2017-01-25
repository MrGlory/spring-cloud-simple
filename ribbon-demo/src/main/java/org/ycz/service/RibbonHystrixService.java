package org.ycz.service;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.ycz.entity.User;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonHystrixService {
  @Autowired
  private RestTemplate restTemplate;
  private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

  /**
   * 使用@HystrixCommand注解指定当该方法发生异常时调用的方法
   */
  @SuppressWarnings("unchecked")
  @HystrixCommand(fallbackMethod = "fallback")
  public List<User> findAll() {
    return this.restTemplate.getForObject("http://provider-user/list", List.class);
  }

  /**
   * hystrix fallback方法
   */
  public List<User> fallback() {
    LOGGER.info("发生异常，进入fallback方法");
    return new ArrayList<User>();
  }
}