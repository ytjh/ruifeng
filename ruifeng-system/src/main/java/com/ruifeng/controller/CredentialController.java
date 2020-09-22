package com.ruifeng.controller;
import com.ruifeng.pojo.CredentialPojo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.service.ICredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 人员证书表
 *
 * @author yuanst
 * @date 2020-09-20 22:40:02
 */
@RestController
@RequestMapping("/credential")
public class CredentialController {

 	@Autowired
    private ICredentialService credentialService;
	/**
	 * 根据实体对象条件查询 人员证书表
	 */
    @PostMapping("/queryBean")
	public List<CredentialPojo> queryBean(@RequestBody CredentialPojo pojo) {
		return credentialService.queryBean(pojo);
	}
	/**
	 * 根据实体对象条件分页查询 人员证书表
	 */
	@PostMapping("/queryPage")
	public IPage<CredentialPojo> queryPage(@RequestBody CredentialPojo pojo) {
		IPage<CredentialPojo> iPage = credentialService.queryPage(pojo);
		return iPage;
	}

	/**
	* 添加 人员证书表
	* @param pojo
	*/
    @PostMapping("/save")
	public void save(@RequestBody CredentialPojo pojo) {
		 credentialService.insert(pojo);
	}
	/**
	 * 修改 人员证书表
	 * @param pojo
	 */
    @PostMapping("/update")
	public void update(@RequestBody CredentialPojo pojo) {
		 credentialService.updateId(pojo);
	}
	/**
	 * 根据主键id删除 建议修改使用逻辑删除 人员证书表
	 */
    @PostMapping("/deleteId")
	public void deleteId(@RequestParam("credentialId") Integer credentialId) {
		 credentialService.deleteById(credentialId);
	}
	/**
	 * 根据主键id查询 人员证书表
	 */
    @GetMapping("/getById")
	public CredentialPojo selectById(@RequestParam("credentialId") Integer credentialId) {
		return credentialService.getById(credentialId);
	}
   
   
    }