package com.ctfo.service;

import java.util.Map;

import com.ctfo.beans.SysSpOperator;

/**
 * 
 * <p>
 * -----------------------------------------------------------------------------
 * <br>
 * 工程名 ： BmApp
 * <br>
 * 功能：登陆用户service接口
 * <br>
 * 描述：车辆服务类
 * <br>
 * 授权 : (C) Copyright (c) 2011
 * <br>
 * 公司 : 北京中交兴路信息科技有限公司
 * <br>
 * -----------------------------------------------------------------------------
 * <table width="432" border="1">
 * <tr><td>版本</td><td>时间</td><td>作者</td><td>改变</td></tr>
 * <tr><td>1.0</td><td>2011-10-10</td><td>LiWeijie</td><td>创建</td></tr>
 * </table>
 * <br>
 * <font color="#FF0000">注意: 本内容仅限于[北京中交兴路信息科技有限公司]内部使用，禁止转发</font>
 * <br>
 * @version 1.0
 * @author LiWeijie
 * @since JDK1.6
 */
public interface RoleManageService {
	
	/**
	 * Login by the specified requestBean
	 * @param param 参数
	 * @return PaginationResultf
	 */
	public Map<String, Object> getRoleList(DynamicSqlParameter requestParam);

	public Map<String, Object> getEditRole(DynamicSqlParameter requestParam);

	public int addRole(DynamicSqlParameter requestParam);

	public int delRole(DynamicSqlParameter requestParam);

	public int editRole(DynamicSqlParameter requestParam);

	public int checkRoleExist(DynamicSqlParameter requestParam);
}
