package com.ruifeng.controller;
import com.ruifeng.pojo.MenuPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 菜单表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:02
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

 	@Autowired
    private IMenuService menuService;
	/**
	 * 根据实体对象条件查询 菜单表
	 */
    @PostMapping("/queryBean")
	public List<MenuPojo> queryBean(@RequestBody MenuPojo pojo) {
		return menuService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 菜单表
	 */
	@PostMapping("/queryPage")
	public IPage<MenuPojo> queryPage(@RequestBody MenuPojo pojo) {
		IPage<MenuPojo> iPage = menuService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 菜单表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody MenuPojo pojo) {
		 menuService.insert(pojo);
	}
	/**
	 * 修改 菜单表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody MenuPojo pojo) {
		 menuService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 菜单表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("menuId") Integer menuId) {
		 menuService.deleteById(menuId);
	}
	/**
	 * 根据主键id查询 菜单表
	 */
    @GetMapping("/getById")
	public MenuPojo selectById(@RequestParam("menuId") Integer menuId) {
		return menuService.getById(menuId);
	}
   
   
    }