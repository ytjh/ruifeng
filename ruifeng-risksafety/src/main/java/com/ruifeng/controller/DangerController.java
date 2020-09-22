package com.ruifeng.controller;
import com.ruifeng.pojo.DangerPojo;
import com.ruifeng.service.IDangerService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 危险源表
 *
 * @author xzj
 * @date 2020-09-21 16:46:57
 */
@RestController
@RequestMapping("/danger")
public class DangerController {

 	@Autowired
    private IDangerService dangerService;

	/**
     * 根据实体对象条件查询危险源表
     */
    @PostMapping("/queryBean")
	public List<DangerPojo> queryBean(@RequestBody DangerPojo pojo) {
		return dangerService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询危险源表
	 */
	@PostMapping("/queryPage")
	public IPage<DangerPojo> queryPage(@RequestBody DangerPojo pojo) {
		IPage<DangerPojo> iPage = dangerService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加危险源表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody DangerPojo pojo){
		dangerService.insert(pojo);
	}

	/**
	 * 修改危险源表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody DangerPojo pojo){
		dangerService.updateId(pojo);
	}

	/**
	 * 根据主键id删除危险源表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		dangerService.deleteById(id);
	}

	/**
	 * 根据主键id查询危险源表
	 */
    @GetMapping("/getById")
	public DangerPojo selectById(@RequestParam("id") Integer id) {
		return dangerService.getById(id);
	}

}