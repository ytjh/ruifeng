package com.ruifeng.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.core.plus.QueryPageResult;
import com.ruifeng.core.rest.BusinessException;
import com.ruifeng.pojo.CmyDemo;
import com.ruifeng.pojo.SysDemo;
import com.ruifeng.service.CmyService;
import com.ruifeng.service.SysService;
import com.ruifeng.service.SystemRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RefreshScope
@RequestMapping("risksafety")
public class RiskDemoController {
    @Autowired
    private CmyService cmyService;

    @Autowired
    private SysService sysService;
    @Autowired
    private SystemRiskService systemRiskService;

    //测试并使用网关
    @GetMapping("safety")
    public String safety(HttpServletRequest request){
        return "风险安全系统成功！" + request.getLocalPort();
    }
    //feign 请求
    @GetMapping("sysRisk")
    public String sysRisk(){
        return systemRiskService.caseDemo();
    }
    //查询系统库的数据
    @GetMapping("sysgetById")
    public SysDemo sysgetById(){
        return sysService.getById(1);
    }
    //查询企业数据库的数据
    @GetMapping("cmygetById")
    public CmyDemo cmygetById(){
        return cmyService.getById(1);
    }
    //plus 分页案例
    @GetMapping("page")
    public IPage<CmyDemo> page(){
        return cmyService.getPage(null);
    }
    //自定义 分页案例
    @PostMapping("queryPage")
    public QueryPageResult<CmyDemo> queryPage(@RequestBody CmyDemo cmyDemo){
        return cmyService.queryPage(cmyDemo);
    }

    @GetMapping("error")
    public String error(){
        try{
        Double a= 1.0*Integer.valueOf("aaa");
        }catch (Exception e){
            throw new BusinessException("201");
        }
        return null;
    }

    @GetMapping("errormsg")
    public String errormsg(){
        try{
            Double a= 1.0*Integer.valueOf("aaa");
        }catch (Exception e){
            String msg = "错误的拼接";
            throw new BusinessException("","就是各种的业务场景，可能有很多不知道的情况,各种拼接"+new Date()+"========"+msg);
        }
        return null;
    }
}
