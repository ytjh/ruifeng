package com.ruifeng.controller;
import com.ruifeng.pojo.ProtectThingPojo;
import com.ruifeng.service.IProtectThingService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 防护用品表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/protectThing")
public class ProtectThingController {

 	@Autowired
    private IProtectThingService protectThingService;

	/**
     * 根据实体对象条件查询防护用品表
     */
    @PostMapping("/queryBean")
	public List<ProtectThingPojo> queryBean(@RequestBody ProtectThingPojo pojo) {
		return protectThingService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询防护用品表
	 */
	@PostMapping("/queryPage")
	public IPage<ProtectThingPojo> queryPage(@RequestBody ProtectThingPojo pojo) {
		IPage<ProtectThingPojo> iPage = protectThingService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加防护用品表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody ProtectThingPojo pojo){
		protectThingService.insert(pojo);
	}

	/**
	 * 修改防护用品表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody ProtectThingPojo pojo){
		protectThingService.updateId(pojo);
	}

	/**
	 * 根据主键id删除防护用品表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		protectThingService.deleteById(id);
	}

	/**
	 * 根据主键id查询防护用品表
	 */
    @GetMapping("/getById")
	public ProtectThingPojo selectById(@RequestParam("id") Integer id) {
		return protectThingService.getById(id);
	}

}