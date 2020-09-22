package com.ruifeng.controller;
import com.ruifeng.pojo.GpsPojo;
import com.ruifeng.service.IGpsService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 定位数据表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/gps")
public class GpsController {

 	@Autowired
    private IGpsService gpsService;

	/**
     * 根据实体对象条件查询定位数据表
     */
    @PostMapping("/queryBean")
	public List<GpsPojo> queryBean(@RequestBody GpsPojo pojo) {
		return gpsService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询定位数据表
	 */
	@PostMapping("/queryPage")
	public IPage<GpsPojo> queryPage(@RequestBody GpsPojo pojo) {
		IPage<GpsPojo> iPage = gpsService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加定位数据表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody GpsPojo pojo){
		gpsService.insert(pojo);
	}

	/**
	 * 修改定位数据表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody GpsPojo pojo){
		gpsService.updateId(pojo);
	}

	/**
	 * 根据主键id删除定位数据表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		gpsService.deleteById(id);
	}

	/**
	 * 根据主键id查询定位数据表
	 */
    @GetMapping("/getById")
	public GpsPojo selectById(@RequestParam("id") Integer id) {
		return gpsService.getById(id);
	}

}