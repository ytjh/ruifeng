package com.ruifeng.service;

import com.ruifeng.core.constant.ServiceNameConstants;
import com.ruifeng.hystrix.SystemFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = ServiceNameConstants.SYSTEM,fallback = SystemFeignClientHystrix.class)
public interface SystemRiskService {
    @GetMapping("/caseDemo")
    String caseDemo();
}
