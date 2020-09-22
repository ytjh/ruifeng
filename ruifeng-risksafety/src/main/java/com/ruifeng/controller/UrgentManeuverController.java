package com.ruifeng.controller;
import com.ruifeng.pojo.UrgentManeuverPojo;
import com.ruifeng.service.IUrgentManeuverService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 应急演习表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:29
 */
@RestController
@RequestMapping("/urgentManeuver")
public class UrgentManeuverController {

 	@Autowired
    private IUrgentManeuverService urgentManeuverService;
	/**
	 * 根据实体对象条件查询 应急演习表
	 */
    @PostMapping("/queryBean")
	public List<UrgentManeuverPojo> queryBean(@RequestBody UrgentManeuverPojo pojo) {
		return urgentManeuverService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 应急演习表
	 */
	@PostMapping("/queryPage")
	public IPage<UrgentManeuverPojo> queryPage(@RequestBody UrgentManeuverPojo pojo) {
		IPage<UrgentManeuverPojo> iPage = urgentManeuverService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 应急演习表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody UrgentManeuverPojo pojo) {
		 urgentManeuverService.insert(pojo);
	}
	/**
	 * 修改 应急演习表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody UrgentManeuverPojo pojo) {
		 urgentManeuverService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 应急演习表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("manId") Integer manId) {
		 urgentManeuverService.deleteById(manId);
	}
	/**
	 * 根据主键id查询 应急演习表
	 */
    @GetMapping("/getById")
	public UrgentManeuverPojo selectById(@RequestParam("manId") Integer manId) {
		return urgentManeuverService.getById(manId);
	}
   
   
    }