package com.ruifeng.controller;
import com.ruifeng.pojo.UrgentPlanPojo;
import com.ruifeng.service.IUrgentPlanService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 应急计划表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/urgentPlan")
public class UrgentPlanController {

 	@Autowired
    private IUrgentPlanService urgentPlanService;
	/**
	 * 根据实体对象条件查询 应急计划表
	 */
    @PostMapping("/queryBean")
	public List<UrgentPlanPojo> queryBean(@RequestBody UrgentPlanPojo pojo) {
		return urgentPlanService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 应急计划表
	 */
	@PostMapping("/queryPage")
	public IPage<UrgentPlanPojo> queryPage(@RequestBody UrgentPlanPojo pojo) {
		IPage<UrgentPlanPojo> iPage = urgentPlanService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 应急计划表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody UrgentPlanPojo pojo) {
		 urgentPlanService.insert(pojo);
	}
	/**
	 * 修改 应急计划表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody UrgentPlanPojo pojo) {
		 urgentPlanService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 应急计划表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("planId") Long planId) {
		 urgentPlanService.deleteById(planId);
	}
	/**
	 * 根据主键id查询 应急计划表
	 */
    @GetMapping("/getById")
	public UrgentPlanPojo selectById(@RequestParam("planId") Long planId) {
		return urgentPlanService.getById(planId);
	}
   
   
    }