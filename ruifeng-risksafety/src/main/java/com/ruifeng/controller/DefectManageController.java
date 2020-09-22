package com.ruifeng.controller;
import com.ruifeng.pojo.DefectManagePojo;
import com.ruifeng.service.IDefectManageService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 隐患登记表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/defectManage")
public class DefectManageController {

 	@Autowired
    private IDefectManageService defectManageService;
	/**
	 * 根据实体对象条件查询 隐患登记表
	 */
    @PostMapping("/queryBean")
	public List<DefectManagePojo> queryBean(@RequestBody DefectManagePojo pojo) {
		return defectManageService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 隐患登记表
	 */
	@PostMapping("/queryPage")
	public IPage<DefectManagePojo> queryPage(@RequestBody DefectManagePojo pojo) {
		IPage<DefectManagePojo> iPage = defectManageService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 隐患登记表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody DefectManagePojo pojo) {
		 defectManageService.insert(pojo);
	}
	/**
	 * 修改 隐患登记表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody DefectManagePojo pojo) {
		 defectManageService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 隐患登记表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("hidId") Long hidId) {
		 defectManageService.deleteById(hidId);
	}
	/**
	 * 根据主键id查询 隐患登记表
	 */
    @GetMapping("/getById")
	public DefectManagePojo selectById(@RequestParam("hidId") Long hidId) {
		return defectManageService.getById(hidId);
	}
   
   
    }