package com.hlm.command;


/**
 * <p>
 * <ul>Users : ��Ӧhlm_users ���ʵ��</ul>
 * <li>userName:�û�����</li>
 * <li>sex:�Ա� 0 ��ʾŮ��1��ʾ��</li>
 * <li>token:ע�����ƣ��ֻ�������</li>
 * <li>tokenType:�������͡�0Ϊ�ֻ���1Ϊ����</li>
 * <li>password:����</li>
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
