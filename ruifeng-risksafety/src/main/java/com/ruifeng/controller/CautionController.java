package com.ruifeng.controller;
import com.ruifeng.pojo.CautionPojo;
import com.ruifeng.service.ICautionService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 预警信息表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/caution")
public class CautionController {

 	@Autowired
    private ICautionService cautionService;
	/**
	 * 根据实体对象条件查询 预警信息表
	 */
    @PostMapping("/queryBean")
	public List<CautionPojo> queryBean(@RequestBody CautionPojo pojo) {
		return cautionService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 预警信息表
	 */
	@PostMapping("/queryPage")
	public IPage<CautionPojo> queryPage(@RequestBody CautionPojo pojo) {
		IPage<CautionPojo> iPage = cautionService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 预警信息表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody CautionPojo pojo) {
		 cautionService.insert(pojo);
	}
	/**
	 * 修改 预警信息表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody CautionPojo pojo) {
		 cautionService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 预警信息表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("warId") Long warId) {
		 cautionService.deleteById(warId);
	}
	/**
	 * 根据主键id查询 预警信息表
	 */
    @GetMapping("/getById")
	public CautionPojo selectById(@RequestParam("warId") Long warId) {
		return cautionService.getById(warId);
	}
   
   
    }