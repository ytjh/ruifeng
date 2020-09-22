package com.ruifeng.controller;
import com.ruifeng.pojo.ParamPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 参数表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:02
 */
@RestController
@RequestMapping("/param")
public class ParamController {

 	@Autowired
    private IParamService paramService;
	/**
	 * 根据实体对象条件查询 参数表
	 */
    @PostMapping("/queryBean")
	public List<ParamPojo> queryBean(@RequestBody ParamPojo pojo) {
		return paramService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 参数表
	 */
	@PostMapping("/queryPage")
	public IPage<ParamPojo> queryPage(@RequestBody ParamPojo pojo) {
		IPage<ParamPojo> iPage = paramService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 参数表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody ParamPojo pojo) {
		 paramService.insert(pojo);
	}
	/**
	 * 修改 参数表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody ParamPojo pojo) {
		 paramService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 参数表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("paramId") Integer paramId) {
		 paramService.deleteById(paramId);
	}
	/**
	 * 根据主键id查询 参数表
	 */
    @GetMapping("/getById")
	public ParamPojo selectById(@RequestParam("paramId") Integer paramId) {
		return paramService.getById(paramId);
	}
   
   
    }