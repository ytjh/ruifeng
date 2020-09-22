package com.ruifeng.controller;
import com.ruifeng.pojo.LogPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 日志表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:02
 */
@RestController
@RequestMapping("/log")
public class LogController {

 	@Autowired
    private ILogService logService;
	/**
	 * 根据实体对象条件查询 日志表
	 */
    @PostMapping("/queryBean")
	public List<LogPojo> queryBean(@RequestBody LogPojo pojo) {
		return logService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 日志表
	 */
	@PostMapping("/queryPage")
	public IPage<LogPojo> queryPage(@RequestBody LogPojo pojo) {
		IPage<LogPojo> iPage = logService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 日志表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody LogPojo pojo) {
		 logService.insert(pojo);
	}
	/**
	 * 修改 日志表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody LogPojo pojo) {
		 logService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 日志表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("logId") Integer logId) {
		 logService.deleteById(logId);
	}
	/**
	 * 根据主键id查询 日志表
	 */
    @GetMapping("/getById")
	public LogPojo selectById(@RequestParam("logId") Integer logId) {
		return logService.getById(logId);
	}
   
   
    }