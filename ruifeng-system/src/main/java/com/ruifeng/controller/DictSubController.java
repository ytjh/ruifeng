package com.ruifeng.controller;
import com.ruifeng.pojo.DictSubPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.IDictSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 字典子表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:02
 */
@RestController
@RequestMapping("/dictSub")
public class DictSubController {

 	@Autowired
    private IDictSubService dictSubService;
	/**
	 * 根据实体对象条件查询 字典子表
	 */
    @PostMapping("/queryBean")
	public List<DictSubPojo> queryBean(@RequestBody DictSubPojo pojo) {
		return dictSubService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 字典子表
	 */
	@PostMapping("/queryPage")
	public IPage<DictSubPojo> queryPage(@RequestBody DictSubPojo pojo) {
		IPage<DictSubPojo> iPage = dictSubService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 字典子表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody DictSubPojo pojo) {
		 dictSubService.insert(pojo);
	}
	/**
	 * 修改 字典子表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody DictSubPojo pojo) {
		 dictSubService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 字典子表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("subDictId") Integer subDictId) {
		 dictSubService.deleteById(subDictId);
	}
	/**
	 * 根据主键id查询 字典子表
	 */
    @GetMapping("/getById")
	public DictSubPojo selectById(@RequestParam("subDictId") Integer subDictId) {
		return dictSubService.getById(subDictId);
	}
   
   
    }