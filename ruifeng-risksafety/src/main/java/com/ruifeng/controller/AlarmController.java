package com.ruifeng.controller;
import com.ruifeng.pojo.AlarmPojo;
import com.ruifeng.service.IAlarmService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 报警记录表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/alarm")
public class AlarmController {

 	@Autowired
    private IAlarmService alarmService;
	/**
	 * 根据实体对象条件查询 报警记录表
	 */
    @PostMapping("/queryBean")
	public List<AlarmPojo> queryBean(@RequestBody AlarmPojo pojo) {
		return alarmService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 报警记录表
	 */
	@PostMapping("/queryPage")
	public IPage<AlarmPojo> queryPage(@RequestBody AlarmPojo pojo) {
		IPage<AlarmPojo> iPage = alarmService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 报警记录表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody AlarmPojo pojo) {
		 alarmService.insert(pojo);
	}
	/**
	 * 修改 报警记录表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody AlarmPojo pojo) {
		 alarmService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 报警记录表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("alertId") Long alertId) {
		 alarmService.deleteById(alertId);
	}
	/**
	 * 根据主键id查询 报警记录表
	 */
    @GetMapping("/getById")
	public AlarmPojo selectById(@RequestParam("alertId") Long alertId) {
		return alarmService.getById(alertId);
	}
   
   
    }