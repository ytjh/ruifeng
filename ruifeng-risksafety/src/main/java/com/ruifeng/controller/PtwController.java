package com.ruifeng.controller;
import com.ruifeng.pojo.PtwPojo;
import com.ruifeng.service.IPtwService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 作业许可表
 *
 * @author yuanst
 * @date 2020-09-20 23:21:30
 */
@RestController
@RequestMapping("/ptw")
public class PtwController {

 	@Autowired
    private IPtwService ptwService;
	/**
	 * 根据实体对象条件查询 作业许可表
	 */
    @PostMapping("/queryBean")
	public List<PtwPojo> queryBean(@RequestBody PtwPojo pojo) {
		return ptwService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 作业许可表
	 */
	@PostMapping("/queryPage")
	public IPage<PtwPojo> queryPage(@RequestBody PtwPojo pojo) {
		IPage<PtwPojo> iPage = ptwService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 作业许可表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody PtwPojo pojo) {
		 ptwService.insert(pojo);
	}
	/**
	 * 修改 作业许可表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody PtwPojo pojo) {
		 ptwService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 作业许可表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("certId") Long certId) {
		 ptwService.deleteById(certId);
	}
	/**
	 * 根据主键id查询 作业许可表
	 */
    @GetMapping("/getById")
	public PtwPojo selectById(@RequestParam("certId") Long certId) {
		return ptwService.getById(certId);
	}
   
   
    }