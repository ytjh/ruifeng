package com.ruifeng.controller;
import com.ruifeng.pojo.ProtectThingUserPojo;
import com.ruifeng.service.IProtectThingUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 防护用品人员关联表
 *
 * @author xzj
 * @date 2020-09-21 16:42:16
 */
@RestController
@RequestMapping("/protectThingUser")
public class ProtectThingUserController {

 	@Autowired
    private IProtectThingUserService protectThingUserService;

	/**
     * 根据实体对象条件查询防护用品人员关联表
     */
    @PostMapping("/queryBean")
	public List<ProtectThingUserPojo> queryBean(@RequestBody ProtectThingUserPojo pojo) {
		return protectThingUserService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询防护用品人员关联表
	 */
	@PostMapping("/queryPage")
	public IPage<ProtectThingUserPojo> queryPage(@RequestBody ProtectThingUserPojo pojo) {
		IPage<ProtectThingUserPojo> iPage = protectThingUserService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加防护用品人员关联表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody ProtectThingUserPojo pojo){
		protectThingUserService.insert(pojo);
	}

	/**
	 * 修改防护用品人员关联表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody ProtectThingUserPojo pojo){
		protectThingUserService.updateId(pojo);
	}

	/**
	 * 根据主键id删除防护用品人员关联表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		protectThingUserService.deleteById(id);
	}

	/**
	 * 根据主键id查询防护用品人员关联表
	 */
    @GetMapping("/getById")
	public ProtectThingUserPojo selectById(@RequestParam("id") Integer id) {
		return protectThingUserService.getById(id);
	}

}