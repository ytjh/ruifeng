package com.ruifeng.controller;
import com.ruifeng.pojo.DictPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 字典表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:02
 */
@RestController
@RequestMapping("/dict")
public class DictController {

 	@Autowired
    private IDictService dictService;
	/**
	 * 根据实体对象条件查询 字典表
	 */
    @PostMapping("/queryBean")
	public List<DictPojo> queryBean(@RequestBody DictPojo pojo) {
		return dictService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 字典表
	 */
	@PostMapping("/queryPage")
	public IPage<DictPojo> queryPage(@RequestBody DictPojo pojo) {
		IPage<DictPojo> iPage = dictService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 字典表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody DictPojo pojo) {
		 dictService.insert(pojo);
	}
	/**
	 * 修改 字典表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody DictPojo pojo) {
		 dictService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 字典表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("dictId") Integer dictId) {
		 dictService.deleteById(dictId);
	}
	/**
	 * 根据主键id查询 字典表
	 */
    @GetMapping("/getById")
	public DictPojo selectById(@RequestParam("dictId") Integer dictId) {
		return dictService.getById(dictId);
	}
   
   
    }