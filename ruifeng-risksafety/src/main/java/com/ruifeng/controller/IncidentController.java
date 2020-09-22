package com.ruifeng.controller;
import com.ruifeng.pojo.IncidentPojo;
import com.ruifeng.service.IIncidentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 事故记录表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/incident")
public class IncidentController {

 	@Autowired
    private IIncidentService incidentService;
	/**
	 * 根据实体对象条件查询 事故记录表
	 */
    @PostMapping("/queryBean")
	public List<IncidentPojo> queryBean(@RequestBody IncidentPojo pojo) {
		return incidentService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 事故记录表
	 */
	@PostMapping("/queryPage")
	public IPage<IncidentPojo> queryPage(@RequestBody IncidentPojo pojo) {
		IPage<IncidentPojo> iPage = incidentService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 事故记录表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody IncidentPojo pojo) {
		 incidentService.insert(pojo);
	}
	/**
	 * 修改 事故记录表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody IncidentPojo pojo) {
		 incidentService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 事故记录表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("accId") Long accId) {
		 incidentService.deleteById(accId);
	}
	/**
	 * 根据主键id查询 事故记录表
	 */
    @GetMapping("/getById")
	public IncidentPojo selectById(@RequestParam("accId") Long accId) {
		return incidentService.getById(accId);
	}
   
   
    }