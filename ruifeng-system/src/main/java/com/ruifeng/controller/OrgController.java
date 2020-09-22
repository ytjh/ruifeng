package com.ruifeng.controller;
import com.ruifeng.pojo.OrgPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 组织表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:01
 */
@RestController
@RequestMapping("/org")
public class OrgController {

 	@Autowired
    private IOrgService orgService;
	/**
	 * 根据实体对象条件查询 组织表
	 */
    @PostMapping("/queryBean")
	public List<OrgPojo> queryBean(@RequestBody OrgPojo pojo) {
		return orgService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 组织表
	 */
	@PostMapping("/queryPage")
	public IPage<OrgPojo> queryPage(@RequestBody OrgPojo pojo) {
		IPage<OrgPojo> iPage = orgService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 组织表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody OrgPojo pojo) {
		 orgService.insert(pojo);
	}
	/**
	 * 修改 组织表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody OrgPojo pojo) {
		 orgService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 组织表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("orgId") Integer orgId) {
		 orgService.deleteById(orgId);
	}
	/**
	 * 根据主键id查询 组织表
	 */
    @GetMapping("/getById")
	public OrgPojo selectById(@RequestParam("orgId") Integer orgId) {
		return orgService.getById(orgId);
	}
   
   
    }