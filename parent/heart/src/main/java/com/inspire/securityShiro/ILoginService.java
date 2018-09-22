package com.inspire.securityShiro;

import org.apache.shiro.authc.UsernamePasswordToken;

import java.util.Collection;

import javax.security.auth.Subject;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public interface ILoginService {

	

	public abstract Collection<String> getUserPurview(ILoginUser user);

	public abstract void DoLoginOk(ILoginUser user);
	
	public abstract ILoginUser getIUser(ShiroUsernamePasswordToken token);

	public abstract Collection<String> getUserRole(ILoginUser user);
	
	public abstract void doLoginIntegral(ILoginUser user);

	public abstract String getRedirectUrl(ServletRequest request,
                                          ServletResponse response, Subject subject);

	public abstract String getSuccessUrl(ServletRequest request,
                                         ServletResponse response);

	

}