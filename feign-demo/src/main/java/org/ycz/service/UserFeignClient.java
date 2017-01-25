package org.ycz.service;

import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ycz.hystrix.HystrixClientFallback;
import org.ycz.entity.User;

/**
 * 使用FeginClient注解，其中name代表eureka上注册服务的ID，fallback代表熔断器，当调用eureka上的服务出现异常时，会进入该熔断器。
 * 从而避免“明知道服务挂了，但还是要继续调用。”的现象。通过turbine或hystrix-dashborad可以监控熔断器的状态。当熔断器触发时，
 * 运维人员\开发人员可以及时处理服务器异常。
 * @author chuck
 *
 */
@FeignClient(name = "provider-user",fallback=HystrixClientFallback.class)
public interface UserFeignClient {
  @RequestMapping("/list")
  public List<User> findAllFeign();
}