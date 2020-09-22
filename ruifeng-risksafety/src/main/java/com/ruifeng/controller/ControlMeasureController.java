package com.ruifeng.controller;
import com.ruifeng.pojo.ControlMeasurePojo;
import com.ruifeng.service.IControlMeasureService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 危险源管控措施表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/controlMeasure")
public class ControlMeasureController {

 	@Autowired
    private IControlMeasureService controlMeasureService;

	/**
     * 根据实体对象条件查询危险源管控措施表
     */
    @PostMapping("/queryBean")
	public List<ControlMeasurePojo> queryBean(@RequestBody ControlMeasurePojo pojo) {
		return controlMeasureService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询危险源管控措施表
	 */
	@PostMapping("/queryPage")
	public IPage<ControlMeasurePojo> queryPage(@RequestBody ControlMeasurePojo pojo) {
		IPage<ControlMeasurePojo> iPage = controlMeasureService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加危险源管控措施表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody ControlMeasurePojo pojo){
		controlMeasureService.insert(pojo);
	}

	/**
	 * 修改危险源管控措施表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody ControlMeasurePojo pojo){
		controlMeasureService.updateId(pojo);
	}

	/**
	 * 根据主键id删除危险源管控措施表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		controlMeasureService.deleteById(id);
	}

	/**
	 * 根据主键id查询危险源管控措施表
	 */
    @GetMapping("/getById")
	public ControlMeasurePojo selectById(@RequestParam("id") Integer id) {
		return controlMeasureService.getById(id);
	}

}