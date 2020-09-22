package com.ruifeng.controller;
import com.ruifeng.pojo.UserRolePojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 用户角色表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:01
 */
@RestController
@RequestMapping("/userRole")
public class UserRoleController {

 	@Autowired
    private IUserRoleService userRoleService;
	/**
	 * 根据实体对象条件查询 用户角色表
	 */
    @PostMapping("/queryBean")
	public List<UserRolePojo> queryBean(@RequestBody UserRolePojo pojo) {
		return userRoleService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 用户角色表
	 */
	@PostMapping("/queryPage")
	public IPage<UserRolePojo> queryPage(@RequestBody UserRolePojo pojo) {
		IPage<UserRolePojo> iPage = userRoleService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 用户角色表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody UserRolePojo pojo) {
		 userRoleService.insert(pojo);
	}
	/**
	 * 修改 用户角色表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody UserRolePojo pojo) {
		 userRoleService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 用户角色表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("userRoleId") Integer userRoleId) {
		 userRoleService.deleteById(userRoleId);
	}
	/**
	 * 根据主键id查询 用户角色表
	 */
    @GetMapping("/getById")
	public UserRolePojo selectById(@RequestParam("userRoleId") Integer userRoleId) {
		return userRoleService.getById(userRoleId);
	}
   
   
    }