package com.ruifeng.controller;
import com.ruifeng.pojo.PlacePojo;
import com.ruifeng.service.IPlaceService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 车间场所表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/place")
public class PlaceController {

 	@Autowired
    private IPlaceService placeService;

	/**
     * 根据实体对象条件查询车间场所表
     */
    @PostMapping("/queryBean")
	public List<PlacePojo> queryBean(@RequestBody PlacePojo pojo) {
		return placeService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询车间场所表
	 */
	@PostMapping("/queryPage")
	public IPage<PlacePojo> queryPage(@RequestBody PlacePojo pojo) {
		IPage<PlacePojo> iPage = placeService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加车间场所表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody PlacePojo pojo){
		placeService.insert(pojo);
	}

	/**
	 * 修改车间场所表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody PlacePojo pojo){
		placeService.updateId(pojo);
	}

	/**
	 * 根据主键id删除车间场所表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		placeService.deleteById(id);
	}

	/**
	 * 根据主键id查询车间场所表
	 */
    @GetMapping("/getById")
	public PlacePojo selectById(@RequestParam("id") Integer id) {
		return placeService.getById(id);
	}

}