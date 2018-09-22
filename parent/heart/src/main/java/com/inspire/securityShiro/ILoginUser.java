package com.inspire.securityShiro;



public interface ILoginUser {

	public abstract String getId();

	public abstract String getLoginName();

	public abstract ShiroUsernamePasswordToken.UserType getUsertype();

	public abstract String getName();

	public abstract String getLastlogintime();

	public abstract boolean IsAdmin();

	public abstract String getPassword();
	
	public abstract String getMemberId();
	
	public abstract String getMemberName();

	int getAuthtype();
	
	
}