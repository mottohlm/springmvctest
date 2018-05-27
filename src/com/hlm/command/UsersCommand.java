package com.hlm.command;


/**
 * <p>
 * <ul>Users : 对应hlm_users 表的实体</ul>
 * <li>userName:用户姓名</li>
 * <li>sex:性别 0 表示女，1表示男</li>
 * <li>token:注册令牌，手机或邮箱</li>
 * <li>tokenType:令牌类型。0为手机，1为邮箱</li>
 * <li>password:密码</li>
 * </p>
 * @author hlm
 *
 */
public class UsersCommand {


	private String userName ;
	private Integer sex ;
	private String token ;
	private Integer tokenType;
	private String password ;
	
	public UsersCommand(){
		
	}
	public UsersCommand(String userName,Integer sex ,String token,
					Integer tokenType,String password){
		this.userName =userName;
		this.sex =sex;
		this.token =token;
		this.tokenType =tokenType;
		this.password =password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Integer getTokenType() {
		return tokenType;
	}
	public void setTokenType(Integer tokenType) {
		this.tokenType = tokenType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
