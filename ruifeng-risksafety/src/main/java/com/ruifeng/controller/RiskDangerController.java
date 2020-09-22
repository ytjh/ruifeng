package com.ruifeng.controller;
import com.ruifeng.pojo.RiskDangerPojo;
import com.ruifeng.service.IRiskDangerService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 企业风险点危险源关联表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/riskDanger")
public class RiskDangerController {

 	@Autowired
    private IRiskDangerService riskDangerService;

	/**
     * 根据实体对象条件查询企业风险点危险源关联表
     */
    @PostMapping("/queryBean")
	public List<RiskDangerPojo> queryBean(@RequestBody RiskDangerPojo pojo) {
		return riskDangerService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询企业风险点危险源关联表
	 */
	@PostMapping("/queryPage")
	public IPage<RiskDangerPojo> queryPage(@RequestBody RiskDangerPojo pojo) {
		IPage<RiskDangerPojo> iPage = riskDangerService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加企业风险点危险源关联表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody RiskDangerPojo pojo){
		riskDangerService.insert(pojo);
	}

	/**
	 * 修改企业风险点危险源关联表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody RiskDangerPojo pojo){
		riskDangerService.updateId(pojo);
	}

	/**
	 * 根据主键id删除企业风险点危险源关联表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		riskDangerService.deleteById(id);
	}

	/**
	 * 根据主键id查询企业风险点危险源关联表
	 */
    @GetMapping("/getById")
	public RiskDangerPojo selectById(@RequestParam("id") Integer id) {
		return riskDangerService.getById(id);
	}

}