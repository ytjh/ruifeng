package com.ruifeng.controller;
import com.ruifeng.pojo.RoleMenuPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 角色菜单表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:01
 */
@RestController
@RequestMapping("/roleMenu")
public class RoleMenuController {

 	@Autowired
    private IRoleMenuService roleMenuService;
	/**
	 * 根据实体对象条件查询 角色菜单表
	 */
    @PostMapping("/queryBean")
	public List<RoleMenuPojo> queryBean(@RequestBody RoleMenuPojo pojo) {
		return roleMenuService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 角色菜单表
	 */
	@PostMapping("/queryPage")
	public IPage<RoleMenuPojo> queryPage(@RequestBody RoleMenuPojo pojo) {
		IPage<RoleMenuPojo> iPage = roleMenuService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 角色菜单表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody RoleMenuPojo pojo) {
		 roleMenuService.insert(pojo);
	}
	/**
	 * 修改 角色菜单表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody RoleMenuPojo pojo) {
		 roleMenuService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 角色菜单表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("sysRoleId") Integer sysRoleId) {
		 roleMenuService.deleteById(sysRoleId);
	}
	/**
	 * 根据主键id查询 角色菜单表
	 */
    @GetMapping("/getById")
	public RoleMenuPojo selectById(@RequestParam("sysRoleId") Integer sysRoleId) {
		return roleMenuService.getById(sysRoleId);
	}
   
   
    }