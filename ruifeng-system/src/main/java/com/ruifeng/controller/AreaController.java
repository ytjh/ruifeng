package com.ruifeng.controller;
import com.ruifeng.pojo.AreaPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 区域表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:02
 */
@RestController
@RequestMapping("/area")
public class AreaController {

 	@Autowired
    private IAreaService areaService;
	/**
	 * 根据实体对象条件查询 区域表
	 */
    @PostMapping("/queryBean")
	public List<AreaPojo> queryBean(@RequestBody AreaPojo pojo) {
		return areaService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 区域表
	 */
	@PostMapping("/queryPage")
	public IPage<AreaPojo> queryPage(@RequestBody AreaPojo pojo) {
		IPage<AreaPojo> iPage = areaService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 区域表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody AreaPojo pojo) {
		 areaService.insert(pojo);
	}
	/**
	 * 修改 区域表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody AreaPojo pojo) {
		 areaService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 区域表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("areaId") Integer areaId) {
		 areaService.deleteById(areaId);
	}
	/**
	 * 根据主键id查询 区域表
	 */
    @GetMapping("/getById")
	public AreaPojo selectById(@RequestParam("areaId") Integer areaId) {
		return areaService.getById(areaId);
	}
   
   
    }