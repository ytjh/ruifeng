package com.ruifeng.hystrix;

import com.ruifeng.service.SystemRiskService;
import org.springframework.stereotype.Service;

@Service
public class SystemFeignClientHystrix implements SystemRiskService {
    public String caseDemo() {
        return "调用服务失败！";
    }
}
