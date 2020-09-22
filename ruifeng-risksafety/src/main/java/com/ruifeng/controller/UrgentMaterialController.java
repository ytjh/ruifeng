package com.ruifeng.controller;
import com.ruifeng.pojo.UrgentMaterialPojo;
import com.ruifeng.service.IUrgentMaterialService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 应急物料表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/urgentMaterial")
public class UrgentMaterialController {

 	@Autowired
    private IUrgentMaterialService urgentMaterialService;
	/**
	 * 根据实体对象条件查询 应急物料表
	 */
    @PostMapping("/queryBean")
	public List<UrgentMaterialPojo> queryBean(@RequestBody UrgentMaterialPojo pojo) {
		return urgentMaterialService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 应急物料表
	 */
	@PostMapping("/queryPage")
	public IPage<UrgentMaterialPojo> queryPage(@RequestBody UrgentMaterialPojo pojo) {
		IPage<UrgentMaterialPojo> iPage = urgentMaterialService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 应急物料表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody UrgentMaterialPojo pojo) {
		 urgentMaterialService.insert(pojo);
	}
	/**
	 * 修改 应急物料表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody UrgentMaterialPojo pojo) {
		 urgentMaterialService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 应急物料表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("matId") Long matId) {
		 urgentMaterialService.deleteById(matId);
	}
	/**
	 * 根据主键id查询 应急物料表
	 */
    @GetMapping("/getById")
	public UrgentMaterialPojo selectById(@RequestParam("matId") Long matId) {
		return urgentMaterialService.getById(matId);
	}
   
   
    }