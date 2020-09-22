package com.ruifeng.controller;
import com.ruifeng.pojo.UrgentTreatmentPojo;
import com.ruifeng.service.IUrgentTreatmentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 应急处置表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/urgentTreatment")
public class UrgentTreatmentController {

 	@Autowired
    private IUrgentTreatmentService urgentTreatmentService;
	/**
	 * 根据实体对象条件查询 应急处置表
	 */
    @PostMapping("/queryBean")
	public List<UrgentTreatmentPojo> queryBean(@RequestBody UrgentTreatmentPojo pojo) {
		return urgentTreatmentService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 应急处置表
	 */
	@PostMapping("/queryPage")
	public IPage<UrgentTreatmentPojo> queryPage(@RequestBody UrgentTreatmentPojo pojo) {
		IPage<UrgentTreatmentPojo> iPage = urgentTreatmentService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 应急处置表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody UrgentTreatmentPojo pojo) {
		 urgentTreatmentService.insert(pojo);
	}
	/**
	 * 修改 应急处置表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody UrgentTreatmentPojo pojo) {
		 urgentTreatmentService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 应急处置表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("disId") Long disId) {
		 urgentTreatmentService.deleteById(disId);
	}
	/**
	 * 根据主键id查询 应急处置表
	 */
    @GetMapping("/getById")
	public UrgentTreatmentPojo selectById(@RequestParam("disId") Long disId) {
		return urgentTreatmentService.getById(disId);
	}
   
   
    }