## spring-cloud-simple  

#该工程为spring cloud样例。  

1.discovery-eureka：服务管理，可做冗余。主要负责服务注册\发现等。  

2.provider-user：服务提供者，根据之前spring_boot_demo修改的。链接:https://github.com/MrGlory/spring_boot_demo  

3.ribbon-demo:服务调用客户端，主要消费eureka中的服务，并提供外部访问接口。本身自带一些负载均衡的策略，也可自定义策略。该样例中集成了熔断器的机制，如果eureka中服务出现异常，那么熔断器会判断是否启动熔断机制，从而保护服务提供者的资源不被耗尽。  

4.feign-demo：服务调用客户端，与ribbon类似，集成了ribbon、熔断器。  

5.hystrix-dashborad:熔断器可视化界面。(同一个界面上只可以展示一个熔断器的信息)  

6.turbine-demo:将多个熔断器可视化界面集成到同一个界面。  

