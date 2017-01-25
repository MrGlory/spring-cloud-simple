package org.ycz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.ycz.entity.User;

@Service
public class RibbonService {
  @Autowired
  private RestTemplate restTemplate;

  @SuppressWarnings("unchecked")
  public List<User> findAll() {
    // http://服务提供者的serviceId/url
    return this.restTemplate.getForObject("http://provider-user/list", List.class);
  }
}