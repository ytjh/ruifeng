package com.ruifeng.controller;
import com.ruifeng.core.plus.QueryPageResult;
import com.ruifeng.model.RiskModel;
import com.ruifeng.pojo.RiskPojo;
import com.ruifeng.service.IRiskService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * 企业风险点表
 *
 * @author xzj
 * @date 2020-09-21 16:42:17
 */
@RestController
@RequestMapping("/risk")
public class RiskController {

 	@Autowired
    private IRiskService riskService;

	/**
     * 根据实体对象条件查询企业风险点表
     */
    @PostMapping("/queryBean")
	public List<RiskPojo> queryBean(@RequestBody RiskPojo pojo) {
		return riskService.queryBean(pojo);
	}

	/**
	 * 根据实体对象条件分页查询企业风险点表
	 */
	@PostMapping("/queryPage")
	public IPage<RiskPojo> queryPage(@RequestBody RiskPojo pojo) {
		IPage<RiskPojo> iPage = riskService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加企业风险点表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody RiskPojo pojo){
		riskService.insert(pojo);
	}

	/**
	 * 修改企业风险点表
	 * @param pojo
	 */
	@PostMapping("/update")
	public void update(@RequestBody RiskPojo pojo){
		riskService.updateId(pojo);
	}

	/**
	 * 根据主键id删除企业风险点表 建议修改使用逻辑删除
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("id") Integer id) {
		riskService.deleteById(id);
	}

	/**
	 * 根据主键id查询企业风险点表
	 */
    @GetMapping("/getById")
	public RiskPojo selectById(@RequestParam("id") Integer id) {
		return riskService.getById(id);
	}

	@PostMapping("/riskListPage")
	public IPage<RiskPojo> riskListPage(@RequestBody RiskPojo pojo){

    	return riskService.riskListPage(pojo);
	}
}