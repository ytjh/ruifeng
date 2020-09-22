package com.ruifeng.controller;
import com.ruifeng.pojo.PlaceUserPojo;
import com.ruifeng.service.IPlaceUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 车间场所人员关联表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/placeUser")
public class PlaceUserController {

 	@Autowired
    private IPlaceUserService placeUserService;

	/**
     * 根据实体对象条件查询车间场所人员关联表
     */
    @PostMapping("/queryBean")
	public List<PlaceUserPojo> queryBean(@RequestBody PlaceUserPojo pojo) {
		return placeUserService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询车间场所人员关联表
	 */
	@PostMapping("/queryPage")
	public IPage<PlaceUserPojo> queryPage(@RequestBody PlaceUserPojo pojo) {
		IPage<PlaceUserPojo> iPage = placeUserService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加车间场所人员关联表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody PlaceUserPojo pojo){
		placeUserService.insert(pojo);
	}

	/**
	 * 修改车间场所人员关联表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody PlaceUserPojo pojo){
		placeUserService.updateId(pojo);
	}

	/**
	 * 根据主键id删除车间场所人员关联表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		placeUserService.deleteById(id);
	}

	/**
	 * 根据主键id查询车间场所人员关联表
	 */
    @GetMapping("/getById")
	public PlaceUserPojo selectById(@RequestParam("id") Integer id) {
		return placeUserService.getById(id);
	}

}