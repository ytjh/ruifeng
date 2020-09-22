package com.ruifeng.controller;
import com.ruifeng.pojo.DevicePojo;
import com.ruifeng.service.IDeviceService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 公司设备表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/device")
public class DeviceController {

 	@Autowired
    private IDeviceService deviceService;

	/**
     * 根据实体对象条件查询公司设备表
     */
    @PostMapping("/queryBean")
	public List<DevicePojo> queryBean(@RequestBody DevicePojo pojo) {
		return deviceService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询公司设备表
	 */
	@PostMapping("/queryPage")
	public IPage<DevicePojo> queryPage(@RequestBody DevicePojo pojo) {
		IPage<DevicePojo> iPage = deviceService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加公司设备表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody DevicePojo pojo){
		deviceService.insert(pojo);
	}

	/**
	 * 修改公司设备表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody DevicePojo pojo){
		deviceService.updateId(pojo);
	}

	/**
	 * 根据主键id删除公司设备表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		deviceService.deleteById(id);
	}

	/**
	 * 根据主键id查询公司设备表
	 */
    @GetMapping("/getById")
	public DevicePojo selectById(@RequestParam("id") Integer id) {
		return deviceService.getById(id);
	}

}