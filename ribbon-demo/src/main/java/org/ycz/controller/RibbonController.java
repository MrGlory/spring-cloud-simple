package org.ycz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ycz.entity.User;
import org.ycz.service.RibbonHystrixService;
import org.ycz.service.RibbonService;

@RestController
public class RibbonController {
  @Autowired
  private RibbonService ribbonService;
  @Autowired
  private RibbonHystrixService rhService;

  /*
   * 未使用熔断策略
   */
  @GetMapping("/ribbon/")
  public List<User> find() {
    return this.ribbonService.findAll();
  }
  
  /*
   * 使用熔断策略
   */
  @GetMapping("/ribbon/hystrix")
  public List<User> findHystrix() {
	    return this.rhService.findAll();
	  }
}