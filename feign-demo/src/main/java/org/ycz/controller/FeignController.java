package org.ycz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ycz.entity.User;
import org.ycz.service.UserFeignClient;

@RestController
public class FeignController {
  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("feign")
  public List<User> findByIdFeign() {
	List<User> user = this.userFeignClient.findAllFeign();
    return user;
  }
}